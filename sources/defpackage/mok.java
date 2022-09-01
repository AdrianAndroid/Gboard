package defpackage;

import android.content.Context;
import android.os.Build;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* renamed from: mok  reason: default package */
/* loaded from: classes2.dex */
public final class mok {
    public static volatile mok a;
    public final Object b;

    public mok(Context context) {
        this.b = context;
    }

    public mok(Context context, String str) {
        this.b = context.getSharedPreferences("FirebaseHeartBeat".concat(str), 0);
    }

    public static mok e(ozr ozrVar) {
        return new mok(ozrVar);
    }

    private final synchronized String f(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.content.SharedPreferences, java.lang.Object] */
    private final synchronized void g() {
        long j = this.b.getLong("fire-count", 0L);
        String str = "";
        String str2 = null;
        for (Map.Entry<String, ?> entry : this.b.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str3 : (Set) entry.getValue()) {
                    if (str2 == null || str2.compareTo(str3) > 0) {
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.b.getStringSet(str, new HashSet()));
        hashSet.remove(str2);
        this.b.edit().putStringSet(str, hashSet).putLong("fire-count", j - 1).commit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Set, java.lang.Object] */
    public final Set a() {
        Set unmodifiableSet;
        synchronized (this.b) {
            unmodifiableSet = Collections.unmodifiableSet(this.b);
        }
        return unmodifiableSet;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v8, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void b(long j, String str) {
        String f = f(j);
        if (this.b.getString("last-used-date", "").equals(f)) {
            return;
        }
        long j2 = this.b.getLong("fire-count", 0L);
        if (j2 + 1 == 30) {
            g();
            j2 = this.b.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.b.getStringSet(str, new HashSet()));
        hashSet.add(f);
        this.b.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", f).commit();
    }

    public final void c() {
        for (pbe pbeVar : (pbe[]) this.b) {
            pbeVar.d();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [ozr, java.lang.Object] */
    public final ozu d(ozs ozsVar) {
        try {
            ?? r0 = this.b;
            paq paqVar = r0;
            if (pbp.f != null) {
                paqVar = r0;
                if (pbq.a.b() != pbt.a) {
                    paqVar = new paq(new pav(r0), 0);
                }
            }
            paqVar.a(ozsVar);
            if (pbp.k != null) {
                pbq.a.b();
            }
            return ozsVar;
        } catch (Throwable th) {
            ols.p(th);
            try {
                ozsVar.il(pbp.a(th));
                return new pbw();
            } catch (Throwable th2) {
                ols.p(th2);
                RuntimeException runtimeException = new RuntimeException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th2);
                pbp.a(runtimeException);
                throw runtimeException;
            }
        }
    }

    public mok() {
        this.b = new HashSet();
    }

    public mok(byte[] bArr) {
        this.b = new LinkedHashMap();
    }

    protected mok(ozr ozrVar) {
        if (pbp.c != null) {
            pbq.a.b();
        }
        this.b = ozrVar;
    }

    public mok(ThreadFactory threadFactory, int i) {
        this.b = new pbe[i];
        for (int i2 = 0; i2 < i; i2++) {
            ((pbe[]) this.b)[i2] = new pbe(threadFactory);
        }
    }
}
