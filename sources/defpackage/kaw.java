package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: kaw  reason: default package */
/* loaded from: classes.dex */
public final class kaw {
    public static final String a = "kaw";
    private static final lfr d = new kar(1);
    private static final lfr e = new kar(0);
    private static final lfr f = new kar(2);
    protected final List b;
    public final mhd c;
    private final Context g;
    private final Executor h;
    private final kax i;
    private final ConnectivityManager j;
    private final Map k;
    private final Map l;
    private final Queue m;
    private boolean n;
    private final BroadcastReceiver o;

    public kaw(kax kaxVar, Context context, Executor executor) {
        this(kaxVar, context, executor, new mhd((byte[]) null), null);
    }

    public static String b(File file, String str) {
        String absolutePath = file.getAbsolutePath();
        return absolutePath + "/" + str;
    }

    public static void k(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (IllegalStateException | NullPointerException unused) {
            }
        }
    }

    private static boolean p(Context context, String str) {
        return uv.a(context, str) == 0;
    }

    private static final void q(List list, lfr lfrVar) {
        lta listIterator = ((llp) list).listIterator();
        while (listIterator.hasNext()) {
            lfrVar.a((kau) listIterator.next());
        }
    }

    public final kaq a(String str, File file, String str2, kan kanVar, kaz kazVar) {
        return new kaq(this, str, file, str2, kanVar, kazVar);
    }

    public final synchronized HttpURLConnection c(String str, String str2) {
        HttpURLConnection a2;
        this.i.e();
        if (p(this.g, "android.permission.INTERNET")) {
            jdg.F(!((kaq) this.k.get(str)).f());
            a2 = this.i.a(str2);
            Object obj = this.c.b;
            if (obj != null) {
                a2.setRequestProperty("User-Agent", (String) obj);
            }
            this.l.put(str, a2);
        } else {
            throw new IllegalStateException("Missing INTERNET permission, can't start download");
        }
        return a2;
    }

    protected final synchronized List d() {
        llk e2;
        e2 = llp.e();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            kau kauVar = (kau) ((WeakReference) it.next()).get();
            if (kauVar == null) {
                it.remove();
            } else {
                e2.h(kauVar);
            }
        }
        return e2.g();
    }

    public final synchronized void e(File file, String str) {
        String b = b(file, str);
        kaq kaqVar = (kaq) this.k.get(b);
        if (kaqVar != null) {
            kaqVar.d();
        }
        k((HttpURLConnection) this.l.get(b));
        if (kaqVar != null) {
            h();
        }
    }

    public final synchronized void f() {
        this.i.b();
        this.i.c();
    }

    public final void g(kaq kaqVar) {
        List d2;
        kaqVar.c();
        synchronized (this) {
            boolean isEmpty = this.m.isEmpty();
            this.m.add(kaqVar);
            if (isEmpty) {
                this.g.registerReceiver(this.o, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.n = true;
                h();
            }
            d2 = this.m.containsAll(this.k.values()) ? d() : null;
        }
        if (d2 != null) {
            q(d2, d);
        }
    }

    public final synchronized void h() {
        this.m.size();
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            kaq kaqVar = (kaq) it.next();
            if (kaqVar.f() || l(kaqVar.a())) {
                it.remove();
                kaqVar.b();
                j(kaqVar);
            }
        }
        if (!this.m.isEmpty() || !this.n) {
            return;
        }
        this.g.unregisterReceiver(this.o);
        this.n = false;
    }

    public final synchronized void i(kau kauVar) {
        this.b.add(new WeakReference(kauVar));
    }

    public final void j(kaq kaqVar) {
        q(d(), e);
        this.h.execute(new kat(this, kaqVar));
    }

    public final synchronized boolean l(kap kapVar) {
        if (kapVar == kap.NONE) {
            return true;
        }
        if (!p(this.g, "android.permission.ACCESS_NETWORK_STATE")) {
            throw new IllegalStateException("Attempting to determine connectivity without the ACCESS_NETWORK_STATE permission.");
        }
        NetworkInfo activeNetworkInfo = this.j.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        if (!activeNetworkInfo.isConnected()) {
            return false;
        }
        int ordinal = kapVar.ordinal();
        if (ordinal == 0) {
            return !wo.a(this.j) || activeNetworkInfo.getType() == 1 || activeNetworkInfo.getType() == 9 || activeNetworkInfo.getType() == 17;
        } else if (ordinal == 1) {
            return activeNetworkInfo.getType() == 0 || activeNetworkInfo.getType() == 4 || activeNetworkInfo.getType() == 6 || activeNetworkInfo.getType() == 7 || activeNetworkInfo.getType() == 1 || activeNetworkInfo.getType() == 9 || activeNetworkInfo.getType() == 16 || activeNetworkInfo.getType() == 17;
        } else {
            Log.e(a, "Unknown connectivity type checked: ".concat(String.valueOf(kapVar.name())));
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean m(kaq kaqVar) {
        String b = b(kaqVar.b, kaqVar.c);
        if (this.k.containsKey(b)) {
            Log.i(a, "Request is already being executed for key: ".concat(b));
            return false;
        }
        this.k.put(b, kaqVar);
        j(kaqVar);
        return true;
    }

    public final void n(File file, String str, kan kanVar, kam kamVar, File file2) {
        List list;
        List d2;
        String b = b(file, str);
        synchronized (this) {
            this.k.remove(b);
            this.l.remove(b);
            list = null;
            if (this.k.isEmpty()) {
                list = d();
                d2 = null;
            } else {
                d2 = this.m.containsAll(this.k.values()) ? d() : null;
            }
        }
        if (kamVar == null) {
            kanVar.b(file2);
        } else {
            kanVar.a(file2, kamVar);
        }
        if (list != null) {
            q(list, f);
        } else if (d2 == null) {
        } else {
            q(d2, d);
        }
    }

    public final synchronized void o(HttpURLConnection httpURLConnection, int i) {
        if (i != -1) {
            this.i.d(httpURLConnection, i);
        }
    }

    public kaw(kax kaxVar, Context context, Executor executor, mhd mhdVar, byte[] bArr) {
        this.k = new HashMap();
        this.l = new HashMap();
        this.m = new ConcurrentLinkedQueue();
        this.b = new ArrayList();
        this.n = false;
        this.o = new kas(this);
        this.g = context;
        this.i = kaxVar;
        this.h = executor;
        this.c = mhdVar;
        this.j = (ConnectivityManager) context.getSystemService("connectivity");
    }
}
