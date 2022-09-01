package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: drk  reason: default package */
/* loaded from: classes.dex */
public final class drk implements Comparable {
    public final String a;
    public final String b;
    public final String c;

    public drk(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        drk drkVar = (drk) obj;
        return lkk.b.c(this.a, drkVar.a).c(this.b, drkVar.b).c(this.c, drkVar.c).a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            drk drkVar = (drk) obj;
            if (jdg.W(this.a, drkVar.a) && jdg.W(this.b, drkVar.b) && jdg.W(this.c, drkVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }
}
