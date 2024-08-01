package net.povstalec.sgjourney.client.resourcepack;

import java.util.Optional;

import javax.annotation.Nullable;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import net.minecraft.resources.ResourceLocation;

public class ResourcepackSounds
{
	public static class Chevron
	{
		public static final String DEFAULT = "default";
		public static final String PRIMARY = "primary_chevron";
		public static final String CHEVRON_1 = "chevron_1";
		public static final String CHEVRON_2 = "chevron_2";
		public static final String CHEVRON_3 = "chevron_3";
		public static final String CHEVRON_4 = "chevron_4";
		public static final String CHEVRON_5 = "chevron_5";
		public static final String CHEVRON_6 = "chevron_6";
		public static final String CHEVRON_7 = "chevron_7";
		public static final String CHEVRON_8 = "chevron_8";
		
		public final ResourceLocation defaultSound;
		@Nullable
		public ResourceLocation primaryChevron;
		@Nullable
		public ResourceLocation chevron1;
		@Nullable
		public ResourceLocation chevron2;
		@Nullable
		public ResourceLocation chevron3;
		@Nullable
		public ResourceLocation chevron4;
		@Nullable
		public ResourceLocation chevron5;
		@Nullable
		public ResourceLocation chevron6;
		@Nullable
		public ResourceLocation chevron7;
		@Nullable
		public ResourceLocation chevron8;
		
		public static final Codec<ResourcepackSounds.Chevron> CODEC = RecordCodecBuilder.create(instance -> instance.group(
				ResourceLocation.CODEC.fieldOf(DEFAULT).forGetter(chevrons -> chevrons.defaultSound),
				ResourceLocation.CODEC.optionalFieldOf(PRIMARY).forGetter(chevrons -> Optional.of(chevrons.primaryChevron)),
				ResourceLocation.CODEC.optionalFieldOf(CHEVRON_1).forGetter(chevrons -> Optional.of(chevrons.chevron1)),
				ResourceLocation.CODEC.optionalFieldOf(CHEVRON_2).forGetter(chevrons -> Optional.of(chevrons.chevron2)),
				ResourceLocation.CODEC.optionalFieldOf(CHEVRON_3).forGetter(chevrons -> Optional.of(chevrons.chevron3)),
				ResourceLocation.CODEC.optionalFieldOf(CHEVRON_4).forGetter(chevrons -> Optional.of(chevrons.chevron4)),
				ResourceLocation.CODEC.optionalFieldOf(CHEVRON_5).forGetter(chevrons -> Optional.of(chevrons.chevron5)),
				ResourceLocation.CODEC.optionalFieldOf(CHEVRON_6).forGetter(chevrons -> Optional.of(chevrons.chevron6)),
				ResourceLocation.CODEC.optionalFieldOf(CHEVRON_7).forGetter(chevrons -> Optional.of(chevrons.chevron7)),
				ResourceLocation.CODEC.optionalFieldOf(CHEVRON_8).forGetter(chevrons -> Optional.of(chevrons.chevron8))
				).apply(instance, ResourcepackSounds.Chevron::new));
		
		public Chevron(ResourceLocation defaultSound, Optional<ResourceLocation> primaryChevron,
				Optional<ResourceLocation> chevron1, Optional<ResourceLocation> chevron2,
				Optional<ResourceLocation> chevron3, Optional<ResourceLocation> chevron4,
				Optional<ResourceLocation> chevron5, Optional<ResourceLocation> chevron6,
				Optional<ResourceLocation> chevron7, Optional<ResourceLocation> chevron8)
		{
			this.defaultSound = defaultSound;
			
			if(primaryChevron.isPresent())
				this.primaryChevron = primaryChevron.isPresent() ? primaryChevron.get() : this.defaultSound;
			
			if(chevron1.isPresent())
				this.chevron1 = chevron1.isPresent() ? chevron1.get() : this.defaultSound;
			
			if(chevron2.isPresent())
				this.chevron2 = chevron2.isPresent() ? chevron2.get() : this.defaultSound;
			
			if(chevron3.isPresent())
				this.chevron3 = chevron3.isPresent() ? chevron3.get() : this.defaultSound;
			
			if(chevron4.isPresent())
				this.chevron4 = chevron4.isPresent() ? chevron4.get() : this.defaultSound;
			
			if(chevron5.isPresent())
				this.chevron5 = chevron5.isPresent() ? chevron5.get() : this.defaultSound;
			
			if(chevron6.isPresent())
				this.chevron6 = chevron6.isPresent() ? chevron6.get() : this.defaultSound;
			
			if(chevron7.isPresent())
				this.chevron7 = chevron7.isPresent() ? chevron7.get() : this.defaultSound;
			
			if(chevron8.isPresent())
				this.chevron8 = chevron8.isPresent() ? chevron8.get() : this.defaultSound;
		}
		
		public ResourceLocation getSound(short chevron)
		{
			return switch(chevron)
			{
			case 0 -> primaryChevron;
			case 1 -> chevron1;
			case 2 -> chevron2;
			case 3 -> chevron3;
			case 4 -> chevron4;
			case 5 -> chevron5;
			case 6 -> chevron6;
			case 7 -> chevron7;
			case 8 -> chevron8;
			default -> defaultSound;
			};
		}
	}
	
	public static class Rotation
	{
		public static final String ROTATION_STARTUP_SOUND = "rotation_startup_sound";
		public static final String ROTATION_BUILDUP_SOUND = "rotation_buildup_sound";
		public static final String ROTATION_SOUND = "rotation_sound";
		public static final String ROTATION_STOP_SOUND = "rotation_stop_sound";
		
		@Nullable
		private ResourceLocation startupSound;
		@Nullable
		private ResourceLocation rotationBuildupSound;
		@Nullable
		private ResourceLocation rotationSound;
		@Nullable
		private ResourceLocation rotationStopSound;
		
		public static final Codec<ResourcepackSounds.Rotation> CODEC = RecordCodecBuilder.create(instance -> instance.group(
				ResourceLocation.CODEC.optionalFieldOf(ROTATION_STARTUP_SOUND).forGetter(ResourcepackSounds.Rotation::startupSound),
				ResourceLocation.CODEC.optionalFieldOf(ROTATION_BUILDUP_SOUND).forGetter(ResourcepackSounds.Rotation::rotationBuildupSound),
				ResourceLocation.CODEC.optionalFieldOf(ROTATION_SOUND).forGetter(ResourcepackSounds.Rotation::rotationSound),
				ResourceLocation.CODEC.optionalFieldOf(ROTATION_STOP_SOUND).forGetter(ResourcepackSounds.Rotation::rotationStopSound)
				).apply(instance, ResourcepackSounds.Rotation::new));
		
		public Rotation(Optional<ResourceLocation> startupSound, Optional<ResourceLocation> rotationBuildupSound,
				Optional<ResourceLocation> rotationSound, Optional<ResourceLocation> rotationStopSound)
		{
			if(startupSound.isPresent())
				this.startupSound = startupSound.get();
			if(rotationBuildupSound.isPresent())
				this.rotationBuildupSound = rotationBuildupSound.get();
			if(rotationSound.isPresent())
				this.rotationSound = rotationSound.get();
			if(rotationStopSound.isPresent())
				this.rotationStopSound = rotationStopSound.get();
		}
		
		public Optional<ResourceLocation> startupSound()
		{
			return Optional.ofNullable(this.startupSound);
		}
		
		public Optional<ResourceLocation> rotationBuildupSound()
		{
			return Optional.ofNullable(this.rotationBuildupSound);
		}
		
		public Optional<ResourceLocation> rotationSound()
		{
			return Optional.ofNullable(this.rotationSound);
		}
		
		public Optional<ResourceLocation> rotationStopSound()
		{
			return Optional.ofNullable(this.rotationStopSound);
		}
	}
	
	public static class IncomingOutgoing
	{
		public static final String OUTGOING = "outgoing";
		public static final String INCOMING = "incoming";
		
		public static final Codec<ResourcepackSounds.IncomingOutgoing> CODEC = RecordCodecBuilder.create(instance -> instance.group(
				ResourceLocation.CODEC.fieldOf(OUTGOING).forGetter(ResourcepackSounds.IncomingOutgoing::outgoing),
				ResourceLocation.CODEC.fieldOf(INCOMING).forGetter(ResourcepackSounds.IncomingOutgoing::incoming)
				).apply(instance, ResourcepackSounds.IncomingOutgoing::new));
		
		private ResourceLocation outgoing;
		private ResourceLocation incoming;
		
		public IncomingOutgoing(ResourceLocation outgoing, ResourceLocation incoming)
		{
			this.outgoing = outgoing;
			this.incoming = incoming;
		}
		
		public ResourceLocation outgoing()
		{
			return outgoing;
		}
		
		public ResourceLocation incoming()
		{
			return incoming;
		}
	}
	
	public static class Wormhole
	{
		public static final String OPEN_SOUND = "open";
		public static final String IDLE_SOUND = "idle";
		public static final String CLOSE_SOUND = "close";
		
		public static final Codec<ResourcepackSounds.Wormhole> CODEC = RecordCodecBuilder.create(instance -> instance.group(
				Codec.either(ResourcepackSounds.IncomingOutgoing.CODEC, ResourceLocation.CODEC).optionalFieldOf(OPEN_SOUND).forGetter(ResourcepackSounds.Wormhole::openSound),
				Codec.either(ResourcepackSounds.IncomingOutgoing.CODEC, ResourceLocation.CODEC).optionalFieldOf(IDLE_SOUND).forGetter(ResourcepackSounds.Wormhole::idleSound),
				Codec.either(ResourcepackSounds.IncomingOutgoing.CODEC, ResourceLocation.CODEC).optionalFieldOf(CLOSE_SOUND).forGetter(ResourcepackSounds.Wormhole::closeSound)
				// TODO probably add some unstable connection sounds in the future
				).apply(instance, ResourcepackSounds.Wormhole::new));
		
		@Nullable
		private Either<ResourcepackSounds.IncomingOutgoing, ResourceLocation> openSound;
		@Nullable
		private Either<ResourcepackSounds.IncomingOutgoing, ResourceLocation> idleSound;
		@Nullable
		private Either<ResourcepackSounds.IncomingOutgoing, ResourceLocation> closeSound;
		
		public Wormhole(Optional<Either<ResourcepackSounds.IncomingOutgoing, ResourceLocation>> openSound,
				Optional<Either<ResourcepackSounds.IncomingOutgoing, ResourceLocation>> idleSound,
				Optional<Either<ResourcepackSounds.IncomingOutgoing, ResourceLocation>> closeSound)
		{
			if(openSound.isPresent())
				this.openSound = openSound.get();
			if(idleSound.isPresent())
				this.idleSound = idleSound.get();
			if(closeSound.isPresent())
				this.closeSound = closeSound.get();
		}
		
		public Optional<Either<ResourcepackSounds.IncomingOutgoing, ResourceLocation>> openSound()
		{
			return Optional.ofNullable(openSound);
		}
		
		public Optional<Either<ResourcepackSounds.IncomingOutgoing, ResourceLocation>> idleSound()
		{
			return Optional.ofNullable(idleSound);
		}
		
		public Optional<Either<ResourcepackSounds.IncomingOutgoing, ResourceLocation>> closeSound()
		{
			return Optional.ofNullable(closeSound);
		}
		
		public Optional<ResourceLocation> getOpenSound(boolean incoming)
		{
			if(openSound == null)
				return Optional.empty();
			
			if(openSound.left().isPresent())
				return Optional.of(incoming ? openSound.left().get().incoming() : openSound.left().get().outgoing());
			
			return Optional.of(openSound.right().get());
		}
		
		public Optional<ResourceLocation> getIdleSound(boolean incoming)
		{
			if(idleSound == null)
				return Optional.empty();
			
			if(idleSound.left().isPresent())
				return Optional.of(incoming ? idleSound.left().get().incoming() : idleSound.left().get().outgoing());
			
			return Optional.of(idleSound.right().get());
		}
		
		public Optional<ResourceLocation> getCloseSound(boolean incoming)
		{
			if(closeSound == null)
				return Optional.empty();
			
			if(closeSound.left().isPresent())
				return Optional.of(incoming ? closeSound.left().get().incoming() : closeSound.left().get().outgoing());
			
			return Optional.of(closeSound.right().get());
		}
	}
}
