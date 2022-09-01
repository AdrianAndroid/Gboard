package defpackage;

/* compiled from: PG */
/* renamed from: ejk  reason: default package */
/* loaded from: classes.dex */
public final class ejk extends ejn {
    private final String a;

    public ejk(String str) {
        this.a = str;
    }

    @Override // defpackage.ejn, defpackage.ejv
    public final String a() {
        return this.a;
    }

    @Override // defpackage.ejv
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ejv) {
            ejv ejvVar = (ejv) obj;
            if (ejvVar.b() == 1 && this.a.equals(ejvVar.a())) {
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
        return "UniversalCategoryItem{category=" + str + "}";
    }
}
