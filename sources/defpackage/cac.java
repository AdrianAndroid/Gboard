package defpackage;

/* compiled from: PG */
/* renamed from: cac  reason: default package */
/* loaded from: classes.dex */
public enum cac implements ids {
    CRANK_ADD_ENGINE("Crank.addEngine-time"),
    CRANK_REMOVE_ENGINE("Crank.removeEngine-time"),
    CRANK_SET_RANKER("Crank.setRanker-time"),
    CRANK_SET_RUNTIME_PARAMS("Crank.setRuntimeParams-time");
    
    private final String f;

    cac(String str) {
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
