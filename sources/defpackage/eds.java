package defpackage;

/* compiled from: PG */
/* renamed from: eds  reason: default package */
/* loaded from: classes.dex */
public final class eds extends edv {
    private final cnz a;

    public eds(cnz cnzVar) {
        this.a = cnzVar;
    }

    @Override // defpackage.edv, defpackage.edw
    public final cnz a() {
        return this.a;
    }

    @Override // defpackage.edw
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof edw) {
            edw edwVar = (edw) obj;
            if (edwVar.b() == 1 && this.a.equals(edwVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String obj = this.a.toString();
        return "GifCategoryItem{gifCategory=" + obj + "}";
    }
}
