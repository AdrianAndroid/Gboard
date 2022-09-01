package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: ndj  reason: default package */
/* loaded from: classes2.dex */
final class ndj {
    final Pattern a;
    final String b;
    boolean c = false;
    int d = -1;
    String e = "";
    final String f = "";
    final String g = "";

    public ndj(String str, String str2) {
        this.a = Pattern.compile("^".concat(str));
        this.b = str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.c = true;
    }
}
