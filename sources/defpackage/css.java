package defpackage;

/* compiled from: PG */
/* renamed from: css  reason: default package */
/* loaded from: classes.dex */
public final class css implements age {
    private final lfb a;
    private final lfb b;
    private final lfb c;

    public css() {
    }

    public css(lfb lfbVar, lfb lfbVar2, lfb lfbVar3) {
        this.a = lfbVar;
        this.b = lfbVar2;
        this.c = lfbVar3;
    }

    @Override // defpackage.age
    public final /* synthetic */ void a(Object obj) {
        cst cstVar = (cst) obj;
        if (cstVar.b() - 1 != 0) {
            return;
        }
        ((hiu) ((lfm) this.a).a).a(cstVar.d());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof css) {
            css cssVar = (css) obj;
            if (this.a.equals(cssVar.a) && this.b.equals(cssVar.b) && this.c.equals(cssVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        return "FutureObserver{onSuccess=" + valueOf + ", onFailure=" + valueOf2 + ", onCancel=" + valueOf3 + "}";
    }
}
