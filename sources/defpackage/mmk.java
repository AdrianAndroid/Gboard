package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: mmk  reason: default package */
/* loaded from: classes2.dex */
public final class mmk {
    public static final Object a = new Object();
    public static final Map b = new qo();
    public final Context c;
    public final mmx d;
    public final moi f;
    private final String h;
    private final mmm i;
    public final AtomicBoolean e = new AtomicBoolean(false);
    private final AtomicBoolean j = new AtomicBoolean();
    public final List g = new CopyOnWriteArrayList();

    static {
        int i = mmi.a;
    }

    public mmk(Context context, String str, mmm mmmVar) {
        List<String> arrayList;
        new CopyOnWriteArrayList();
        fyb.ax(context);
        this.c = context;
        fyb.aF(str);
        this.h = str;
        this.i = mmmVar;
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    String obj = ComponentDiscoveryService.class.toString();
                    Log.w("ComponentDiscovery", obj + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        for (String str3 : arrayList) {
            arrayList2.add(new mmw(str3, 1));
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        arrayList3.add(new mmw(new FirebaseCommonRegistrar(), 0));
        msc.n(mmr.d(context, Context.class, new Class[0]), arrayList4);
        msc.n(mmr.d(this, mmk.class, new Class[0]), arrayList4);
        msc.n(mmr.d(mmmVar, mmm.class, new Class[0]), arrayList4);
        mmx mmxVar = new mmx(arrayList3, arrayList4);
        this.d = mmxVar;
        new mne(new mmv(this, context, 1));
        this.f = mmxVar.c(moe.class);
        opu opuVar = new opu(this);
        e();
        if (this.e.get() && fot.a.c()) {
            opuVar.b(true);
        }
        this.g.add(opuVar);
    }

    public static mmk a() {
        mmk mmkVar;
        BufferedReader bufferedReader;
        synchronized (a) {
            mmkVar = (mmk) b.get("[DEFAULT]");
            if (mmkVar == null) {
                if (fsh.a == null) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        fsh.a = Application.getProcessName();
                    } else {
                        int i = fsh.b;
                        if (i == 0) {
                            i = Process.myPid();
                            fsh.b = i;
                        }
                        String str = null;
                        str = null;
                        str = null;
                        BufferedReader bufferedReader2 = null;
                        if (i > 0) {
                            try {
                                String str2 = "/proc/" + i + "/cmdline";
                                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                bufferedReader = new BufferedReader(new FileReader(str2));
                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                                try {
                                    String readLine = bufferedReader.readLine();
                                    fyb.ax(readLine);
                                    str = readLine.trim();
                                } catch (IOException unused) {
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedReader2 = bufferedReader;
                                    fsg.a(bufferedReader2);
                                    throw th;
                                }
                            } catch (IOException unused2) {
                                bufferedReader = null;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            fsg.a(bufferedReader);
                        }
                        fsh.a = str;
                    }
                }
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + fsh.a + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return mmkVar;
    }

    public final mmm b() {
        e();
        return this.i;
    }

    public final String c() {
        e();
        return this.h;
    }

    public final String d() {
        String z = fyb.z(c().getBytes(Charset.defaultCharset()));
        String z2 = fyb.z(b().b.getBytes(Charset.defaultCharset()));
        return z + "+" + z2;
    }

    public final void e() {
        fyb.aE(!this.j.get(), "FirebaseApp was deleted");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mmk)) {
            return false;
        }
        return this.h.equals(((mmk) obj).c());
    }

    public final void f() {
        HashMap hashMap;
        if (!lj.b(this.c)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ".concat(String.valueOf(c())));
            Context context = this.c;
            if (mmj.a.get() != null) {
                return;
            }
            mmj mmjVar = new mmj(context);
            AtomicReference atomicReference = mmj.a;
            while (!atomicReference.compareAndSet(null, mmjVar)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            context.registerReceiver(mmjVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app ".concat(String.valueOf(c())));
        mmx mmxVar = this.d;
        boolean equals = "[DEFAULT]".equals(c());
        AtomicReference atomicReference2 = mmxVar.b;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (!atomicReference2.compareAndSet(null, valueOf)) {
                if (atomicReference2.get() != null) {
                    break;
                }
            } else {
                synchronized (mmxVar) {
                    hashMap = new HashMap(mmxVar.a);
                }
                mmxVar.e(hashMap);
                break;
            }
        }
        ((moe) this.f.a()).a();
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        fyb.aL("name", this.h, arrayList);
        fyb.aL("options", this.i, arrayList);
        return fyb.aK(arrayList, this);
    }
}
