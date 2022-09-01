package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ejm  reason: default package */
/* loaded from: classes.dex */
public final class ejm extends ejn {
    private final String a;

    public ejm(String str) {
        this.a = str;
    }

    @Override // defpackage.ejv
    public final int b() {
        return 2;
    }

    @Override // defpackage.ejn, defpackage.ejv
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ejv) {
            ejv ejvVar = (ejv) obj;
            if (ejvVar.b() == 2 && this.a.equals(ejvVar.c())) {
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
        return "UniversalCategoryItem{search=" + str + "}";
    }
}
