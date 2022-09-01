package defpackage;

/* compiled from: PG */
/* renamed from: heb  reason: default package */
/* loaded from: classes.dex */
public final class heb extends hed {
    private final String a;

    public heb(String str) {
        this.a = str;
    }

    @Override // defpackage.hel
    public final int b() {
        return 4;
    }

    @Override // defpackage.hed, defpackage.hel
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hel) {
            hel helVar = (hel) obj;
            if (helVar.b() == 4 && this.a.equals(helVar.c())) {
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
        return "Item{emptyCategoryDesc=" + str + "}";
    }
}
