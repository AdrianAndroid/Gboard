package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: ezp  reason: default package */
/* loaded from: classes.dex */
public final class ezp {
    public String a = "";
    public String b = "auto";
    public String c = "en";
    public boolean d = false;
    public boolean e = false;

    public final ezq a() {
        return new ezq(this);
    }

    public final void b(String str) {
        String str2 = "auto";
        if (!TextUtils.isEmpty(str) && !str.equals(str2)) {
            str2 = ezz.b(str);
        }
        this.b = str2;
    }

    public final void c(String str) {
        this.c = TextUtils.isEmpty(str) ? "en" : ezz.c(str);
    }
}
