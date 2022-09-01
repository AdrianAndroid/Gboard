package defpackage;

/* compiled from: PG */
/* renamed from: hps  reason: default package */
/* loaded from: classes.dex */
public enum hps implements ido {
    SET_COMPOSING_TEXT_CRASH("InputConnection.SetComposingTextCrash"),
    IC_WAIT_FUTURE_TIMEOUT("IC.WaitTimeout"),
    IC_STOP_CALL("IC.StopCall");
    
    private final String e;

    hps(String str) {
        this.e = str;
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
