package defpackage;

/* compiled from: PG */
/* renamed from: edu  reason: default package */
/* loaded from: classes.dex */
public final class edu extends edv {
    private final String a;

    public edu(String str) {
        this.a = str;
    }

    @Override // defpackage.edw
    public final int b() {
        return 3;
    }

    @Override // defpackage.edv, defpackage.edw
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof edw) {
            edw edwVar = (edw) obj;
            if (edwVar.b() == 3 && this.a.equals(edwVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        return "GifCategoryItem{search=" + str + "}";
    }
}
