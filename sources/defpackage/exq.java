package defpackage;

/* compiled from: PG */
/* renamed from: exq  reason: default package */
/* loaded from: classes.dex */
public enum exq implements ido {
    PERSONALIZATION_JOB_COMPLETED,
    PERSONALIZED_NWP_NOTIFICATION_SENT,
    PERSONALIZED_NEURAL_RESCORING_MODEL_NOTIFICATION_SENT;

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return 1000;
    }

    @Override // defpackage.idt
    public final /* synthetic */ String b() {
        return "";
    }

    @Override // defpackage.ido
    public final /* synthetic */ boolean c() {
        return true;
    }
}    public static exw[] values() {
        return (exw[]) d.clone();
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return 1000;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.c;
    }

    @Override // defpackage.ido
    public final /* synthetic */ boolean c() {
        return true;
    }

    private exw(byte[] bArr) {
        this.c = "Personalization.Speech.Status";
    }
}
