package defpackage;

/* compiled from: PG */
/* renamed from: dta  reason: default package */
/* loaded from: classes.dex */
public enum dta implements ids {
    NGA_MIC_TAP_TO_VOICE_UI_SHOWN_TIME("VoiceInput.NGA.micTapToUiShown-time"),
    NGA_MIC_TAP_TO_FIRST_TEXT_TIME("VoiceInput.NGA.micTapToFirstText-time"),
    NGA_SPEECH_START_TO_FIRST_TEXT_TIME("VoiceInput.NGA.speechStartToFirstText-time"),
    NGA_AIAI_MIC_TAP_TO_START_LISTENING_TIME("VoiceInput.NGA.AiAi.micTapToStartListening-time"),
    NGA_AIAI_MIC_TAP_TO_FIRST_TEXT_TIME("VoiceInput.NGA.AiAi.micTapToFirstText-time"),
    NGA_AIAI_SPEECH_START_TO_FIRST_TEXT_TIME("VoiceInput.NGA.AiAi.speechStartToFirstText-time"),
    NGA_ON_DEVICE_MIC_TAP_TO_START_LISTENING_TIME("VoiceInput.NGA.OnDevice.micTapToStartListening-time"),
    NGA_ON_DEVICE_MIC_TAP_TO_FIRST_TEXT_TIME("VoiceInput.NGA.OnDevice.micTapToFirstText-time"),
    NGA_ON_DEVICE_SPEECH_START_TO_FIRST_TEXT_TIME("VoiceInput.NGA.OnDevice.speechStartToFirstText-time"),
    NGA_S3_MIC_TAP_TO_START_LISTENING_TIME("VoiceInput.NGA.S3.micTapToStartListening-time"),
    NGA_S3_MIC_TAP_TO_FIRST_TEXT_TIME("VoiceInput.NGA.S3.micTapToFirstText-time"),
    NGA_S3_SPEECH_START_TO_FIRST_TEXT_TIME("VoiceInput.NGA.S3.speechStartToFirstText-time");
    
    private final String n;

    dta(String str) {
        this.n = str;
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return -1;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.n;
    }
}
