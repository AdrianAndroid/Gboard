package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: fsi  reason: default package */
/* loaded from: classes.dex */
public final class fsi {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    public static boolean a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
