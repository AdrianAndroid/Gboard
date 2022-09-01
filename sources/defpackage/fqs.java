package defpackage;

import android.accounts.Account;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: fqs  reason: default package */
/* loaded from: classes.dex */
public final class fqs {
    public final Account a;
    public final Set b;
    public final Set c;
    public final String d;
    public final String e;
    public final gdv f;
    public Integer g;
    private final Map h;

    public fqs(Account account, Set set, Map map, String str, String str2, gdv gdvVar) {
        this.a = account;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.h = map;
        this.d = str;
        this.e = str2;
        this.f = gdvVar == null ? gdv.b : gdvVar;
        HashSet hashSet = new HashSet(emptySet);
        for (fpp fppVar : map.values()) {
            Object obj = fppVar.a;
            hashSet.addAll(null);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }
}
