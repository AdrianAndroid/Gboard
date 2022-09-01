package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: ntj  reason: default package */
/* loaded from: classes2.dex */
public final class ntj {
    public static final Logger a = Logger.getLogger(ntj.class.getName());
    public static final ntj b = new ntj();
    public final ConcurrentNavigableMap c = new ConcurrentSkipListMap();
    public final ConcurrentNavigableMap d = new ConcurrentSkipListMap();
    public final ConcurrentMap e = new ConcurrentHashMap();
    public final ConcurrentMap f = new ConcurrentHashMap();
    public final ConcurrentMap g = new ConcurrentHashMap();

    public static long a(ntr ntrVar) {
        return ntrVar.c().a;
    }

    public static void b(Map map, ntl ntlVar) {
        ntl ntlVar2 = (ntl) map.put(Long.valueOf(ntlVar.c().a), ntlVar);
    }

    public static void c(Map map, ntl ntlVar) {
        ntl ntlVar2 = (ntl) map.remove(Long.valueOf(a(ntlVar)));
    }
}
