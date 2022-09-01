package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: lbi  reason: default package */
/* loaded from: classes.dex */
public final class lbi {
    public final Object a;

    public lbi(Context context) {
        this.a = context;
    }

    public lbi(Context context, byte[] bArr) {
        this.a = context;
    }

    public lbi(Context context, char[] cArr) {
        this.a = context;
    }

    public lbi(Map map) {
        this.a = map;
    }

    public lbi(ofl oflVar) {
        this.a = oflVar;
    }

    public lbi(byte[] bArr) {
        this.a = new AtomicLong();
    }

    public static String c(Locale locale) {
        return String.valueOf(locale.getLanguage()).concat(locale.getCountry().isEmpty() ? "" : "_".concat(String.valueOf(locale.getCountry())));
    }

    public final SharedPreferences a() {
        return ((Context) this.a).getSharedPreferences("playcore_split_install_internal", 0);
    }

    public final Set b() {
        Set<String> hashSet;
        synchronized (lbi.class) {
            try {
                hashSet = a().getStringSet("modules_to_uninstall_if_emulated", new HashSet());
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                }
            } catch (Exception unused) {
                hashSet = new HashSet<>();
            }
        }
        return hashSet;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map, java.lang.Object] */
    public final Map d(Collection collection) {
        Set unmodifiableSet;
        HashMap hashMap = new HashMap();
        for (String str : this.a.keySet()) {
            if (!this.a.containsKey(str)) {
                unmodifiableSet = Collections.emptySet();
            } else {
                HashSet hashSet = new HashSet();
                for (Map.Entry entry : ((Map) this.a.get(str)).entrySet()) {
                    if (collection.contains(entry.getKey())) {
                        hashSet.add((String) entry.getValue());
                    }
                }
                unmodifiableSet = Collections.unmodifiableSet(hashSet);
            }
            hashMap.put(str, unmodifiableSet);
        }
        return hashMap;
    }

    public final long e(long j) {
        return ((AtomicLong) this.a).addAndGet(j);
    }

    public lbi() {
        this.a = new ArrayList(20);
    }
}
