package defpackage;

/* compiled from: PG */
/* renamed from: dsb  reason: default package */
/* loaded from: classes.dex */
public enum dsb implements ids {
    DECODE_JAPANESE_DECODER("Decoder.Japanese-time"),
    MOZC_CANDIDATE_SUBMIT_FROM_VISIBLE_ROW("Mozc.CandFromVisibleRow-time"),
    MOZC_CANDIDATE_SUBMIT_FROM_INVISIBLE_ROW("Mozc.CandFromInvisibleRow-time");
    
    private final String e;

    dsb(String str) {
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
