package defpackage;

/* compiled from: PG */
/* renamed from: dpo  reason: default package */
/* loaded from: classes.dex */
public enum dpo implements ids {
    LSTM_EXTENSION_ON_CREATE_APP("LstmExtension.onCreateApp-time"),
    LSTM_EXTENSION_ON_CREATE_SERVICE("LstmExtension.onCreateService-time"),
    LSTM_EXTENSION_ON_START_INPUT_VIEW("LstmExtension.onStartInputView-time");
    
    private final String e;

    dpo(String str) {
        this.e = str;
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return -1;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.e;
    }
}
