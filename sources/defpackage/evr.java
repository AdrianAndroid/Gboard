package defpackage;

/* compiled from: PG */
/* renamed from: evr  reason: default package */
/* loaded from: classes.dex */
public enum evr implements ido {
    NUM_SESSION("Ekho.NumSession", nni.GBOARD_SESSION),
    NUM_VOICE_RECORDING("Ekho.NumVoiceRecording", nni.GBOARD_VOICE_RECORDING);
    
    public final nni c;
    private final String e;

    evr(String str, nni nniVar) {
        this.e = str;
        this.c = nniVar;
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return 1000;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.e;
    }

    @Override // defpackage.ido
    public final /* synthetic */ boolean c() {
        return true;
    }
}
