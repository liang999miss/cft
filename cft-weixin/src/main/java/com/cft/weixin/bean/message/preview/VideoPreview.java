package com.cft.weixin.bean.message.preview;

import com.cft.weixin.bean.message.Uploadvideo;

public class VideoPreview extends Preview {

	private Uploadvideo video;

	public VideoPreview(){

	}
	public VideoPreview(Uploadvideo video) {
		super();
		this.setMsgtype("video");
		this.video = video;
	}

	public Uploadvideo getVideo() {
		return video;
	}

	public void setVideo(Uploadvideo video) {
		this.video = video;
	}

}
