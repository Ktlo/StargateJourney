package net.povstalec.sgjourney.client.widgets;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.povstalec.sgjourney.StargateJourney;

public class TransceiverButton extends SGJourneyButton
{
	public TransceiverButton(int x, int y, Component component, OnPress press)
	{
		super(new ResourceLocation(StargateJourney.MODID, "textures/gui/transceiver/transceiver_widgets.png"), x, y, 16, 10, component, press);
	}
}