package com.cft.weixin.bean.xmlmessage;

import com.cft.weixin.bean.message.message.Message;
import com.cft.weixin.bean.message.message.VoiceMessage;

public class XMLVoiceMessage extends XMLMessage {

	private static final long serialVersionUID = 2372031664279510333L;

	private String mediaId;

	public XMLVoiceMessage(String toUserName, String fromUserName, String mediaId) {
		super(toUserName, fromUserName, "voice");
		this.mediaId = mediaId;
	}

	@Override
	public String subXML() {
		return "<Voice><MediaId><![CDATA[" + mediaId + "]]></MediaId></Voice>";
	}

	@Override
	public Message convert() {
		return new VoiceMessage(toUserName, mediaId);
	}

}
