package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: kos  reason: default package */
/* loaded from: classes.dex */
public final class kos {
    public static final Pattern a = Pattern.compile("[a-z]+(_[a-z]+)*");
    static final Account b = kop.a;
    public static final Set c = Collections.unmodifiableSet(new HashSet(Arrays.asList("default", "unused", "special", "reserved", "shared", "virtual", "managed")));
    public static final Set d = Collections.unmodifiableSet(new HashSet(Arrays.asList("files", "cache", "managed", "directboot-files", "directboot-cache", "external")));

    public static kor a(Context context) {
        return new kor(context);
    }
}
