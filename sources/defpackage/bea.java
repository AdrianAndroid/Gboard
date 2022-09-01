package defpackage;

/* compiled from: PG */
/* renamed from: bea  reason: default package */
/* loaded from: classes.dex */
final class bea implements bdp {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bea(bdl bdlVar, int i) {
        this.b = i;
        this.a = bdlVar;
    }

    public bea(beb bebVar, int i) {
        this.b = i;
        this.a = bebVar;
    }

    public final String toString() {
        if (this.b != 0) {
            String obj = super.toString();
            String obj2 = this.a.toString();
            return obj + "{fragment=" + obj2 + "}";
        }
        String obj3 = super.toString();
        String obj4 = this.a.toString();
        return obj3 + "{fragment=" + obj4 + "}";
    }
}
