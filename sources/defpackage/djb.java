package defpackage;

/* compiled from: PG */
/* renamed from: djb  reason: default package */
/* loaded from: classes.dex */
public enum djb implements ids {
    DECODE_HMM_TYPING("HmmDecoder.TypingTime"),
    DECODE_HMM_GESTURE("HmmDecoder.GestureTime"),
    DECODE_HMM_PREDICTION("HmmDecoder.PredictionTime"),
    DECODE_HANDWRITING_HMM_INCREMENTAL("HmmDecoder.HandwritingIncrementalTime");
    
    private final String f;

    djb(String str) {
        this.f = str;
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return -1;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.f;
    }
}
