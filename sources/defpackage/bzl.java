package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.inputmethod.libs.dataservice.superpacks.SuperpacksGcRunner;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bzl  reason: default package */
/* loaded from: classes.dex */
public final class bzl implements mix {
    final /* synthetic */ String a;
    final /* synthetic */ bzr b;

    public bzl(bzr bzrVar, String str) {
        this.b = bzrVar;
        this.a = str;
    }

    @Override // defpackage.mix
    public final mko a() {
        boolean contains;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        hhl hhlVar = bzr.b;
        if (this.b.k.get() == null) {
            bzr bzrVar = this.b;
            ((ltd) ((ltd) bzr.c.b()).k("com/google/android/apps/inputmethod/libs/dataservice/superpacks/SuperpacksManagerImpl", "initializeInternal", 472, "SuperpacksManagerImpl.java")).t("initializeInternal()");
            bzc bzcVar = new bzc(bzrVar.h);
            jqw jqwVar = new jqw(bzrVar.g.getApplicationContext());
            jqwVar.g = 1048576000L;
            jqwVar.h = bzcVar;
            jqwVar.f = bzrVar.i;
            jtq.s("maxAllowedValidationFailureCount", 2L);
            jqwVar.j = 2;
            jqwVar.c.a(jxx.e(gxo.c(9)), 0);
            jqwVar.d.a(new jwf(gxo.c(2)), 0);
            try {
                Boolean bool = cf.a;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    Exception exc = cf.b;
                    if (exc != null) {
                        throw exc;
                    }
                    try {
                        if (Integer.parseInt(Build.VERSION.SDK) < 8) {
                            if (!"sdk".equals(Build.PRODUCT) && !"google_sdk".equals(Build.PRODUCT)) {
                                z4 = false;
                                cf.a = Boolean.valueOf(z4);
                            }
                            z4 = true;
                            cf.a = Boolean.valueOf(z4);
                        } else {
                            Class<?> cls = Class.forName("android.os.Build");
                            Field field = cls.getField("HARDWARE");
                            field.setAccessible(true);
                            String str = (String) field.get(cls);
                            if (!"goldfish".equals(str) && !"ranchu".equals(str)) {
                                z3 = false;
                                cf.a = Boolean.valueOf(z3);
                            }
                            z3 = true;
                            cf.a = Boolean.valueOf(z3);
                        }
                        z = cf.a.booleanValue();
                    } catch (Exception e) {
                        cf.b = e;
                        throw e;
                    }
                }
            } catch (Exception e2) {
                Log.w("IsEmulator", "Could not determine if emulator.  Assuming false.", e2);
                z = false;
            }
            jzm l = bzr.l(bzrVar.g);
            jzb f = jzc.f();
            f.a = bzrVar.g;
            f.d = !z;
            f.b = l;
            if (f.c == null) {
                f.c = jvi.e(jvl.b(f.a));
            }
            if (f.b == null) {
                jyx f2 = jyy.f();
                f2.b = f.a;
                f.b = f2.a();
            }
            jzc jzcVar = new jzc(f);
            jqwVar.a(new byv(bzrVar.g, jzcVar, bzr.n(), bzr.o()));
            jqwVar.a(jzcVar);
            bzrVar.k.set(new jqx(jqwVar));
            jzc c = ((jqx) bzrVar.k.get()).c();
            if (c == null) {
                lug lugVar = jsh.a;
            } else {
                jzm g = c.g();
                if (g.equals(l)) {
                    lug lugVar2 = jsh.a;
                } else {
                    ((luc) ((luc) jsh.a.b()).k("com/google/android/libraries/micore/superpacks/Superpacks", "switchBackgroundTaskScheduler", 2089, "Superpacks.java")).G("Switching the task scheduler from %s to %s", g.getClass().getName(), l.getClass().getName());
                    try {
                        c.h(l);
                        z2 = true;
                    } catch (IOException | jzl e3) {
                        ((luc) ((luc) ((luc) jsh.a.c()).i(e3)).k("com/google/android/libraries/micore/superpacks/Superpacks", "switchBackgroundTaskScheduler", 2100, "Superpacks.java")).G("Failed to switch the task scheduler from %s to %s", g.getClass().getName(), l.getClass().getName());
                    }
                    ((ltd) ((ltd) bzr.c.b()).k("com/google/android/apps/inputmethod/libs/dataservice/superpacks/SuperpacksManagerImpl", "initializeInternal", 529, "SuperpacksManagerImpl.java")).w("Switched background task scheduler: %s", Boolean.valueOf(z2));
                    isn a = iso.a("superpacks-gc-task", SuperpacksGcRunner.class.getName());
                    a.m = true;
                    a.b();
                    ism.a(bzrVar.g).c(a.a());
                    bzrVar.j();
                    bzrVar.l.f(bzrVar.i);
                }
            }
            z2 = false;
            ((ltd) ((ltd) bzr.c.b()).k("com/google/android/apps/inputmethod/libs/dataservice/superpacks/SuperpacksManagerImpl", "initializeInternal", 529, "SuperpacksManagerImpl.java")).w("Switched background task scheduler: %s", Boolean.valueOf(z2));
            isn a2 = iso.a("superpacks-gc-task", SuperpacksGcRunner.class.getName());
            a2.m = true;
            a2.b();
            ism.a(bzrVar.g).c(a2.a());
            bzrVar.j();
            bzrVar.l.f(bzrVar.i);
        }
        if (TextUtils.isEmpty(this.a)) {
            return kcu.K(null);
        }
        synchronized (this.b.e) {
            contains = this.b.e.contains(this.a);
        }
        if (contains) {
            return kcu.K(null);
        }
        synchronized (this.b.f) {
            bzu bzuVar = (bzu) this.b.f.get(this.a);
            if (bzuVar == null) {
                String str2 = this.a;
                return kcu.J(new IllegalStateException("module `" + str2 + "` didn't provide setup strategy"));
            }
            bzr bzrVar2 = this.b;
            synchronized (bzrVar2.e) {
                if (bzrVar2.e.contains(bzuVar.a)) {
                    ((ltd) ((ltd) bzr.c.c()).k("com/google/android/apps/inputmethod/libs/dataservice/superpacks/SuperpacksManagerImpl", "doRegisterSuperpacksStrategies", 913, "SuperpacksManagerImpl.java")).w("superpack %s is already registered", bzuVar.a);
                } else {
                    if (bzuVar.c != null) {
                        String str3 = bzuVar.a;
                        jqa jqaVar = bzuVar.c;
                        jpw jpwVar = ((jph) ((jqx) bzrVar2.k.get()).k).a;
                        synchronized (jpwVar) {
                            jpwVar.b(str3);
                            jpwVar.b.put(str3, jqaVar);
                        }
                    }
                    if (bzuVar.b != null) {
                        ((jqx) bzrVar2.k.get()).e.h(bzuVar.b);
                    }
                    List<jty> list = bzuVar.d;
                    if (list != null) {
                        for (jty jtyVar : list) {
                            ((jqx) bzrVar2.k.get()).e.g(jtyVar);
                        }
                    }
                    String str4 = bzuVar.a;
                    synchronized (bzrVar2.e) {
                        if (bzrVar2.e.add(str4)) {
                            bzrVar2.h.e(irk.STATE_REACHED, bzr.p(str4), 1);
                        }
                    }
                    jqx jqxVar = (jqx) bzrVar2.k.get();
                    synchronized (bzrVar2.e) {
                        String str5 = bzuVar.a;
                        lug lugVar3 = jsh.a;
                        jtq.i(Long.MAX_VALUE);
                        jvr jvrVar = jqxVar.f;
                        synchronized (jvrVar.b) {
                            if (jvrVar.c.containsKey(str5)) {
                                long j = ((jwa) jvrVar.c.get(str5)).b;
                                if (j != Long.MAX_VALUE) {
                                    ((luc) ((luc) jsh.a.d()).k("com/google/android/libraries/micore/superpacks/gc/FileManager", "registerNamespace", 212, "FileManager.java")).J("Namespace %s is already registered with different quota!(%s instead of the requested %s). The new quota will be ignored as this operation is not yet supported", str5, jtq.i(j), jtq.i(Long.MAX_VALUE));
                                }
                            } else {
                                jvrVar.c.put(str5, jwa.a(str5, Long.MAX_VALUE, false));
                            }
                        }
                        String str6 = bzuVar.a;
                        jrp d = jrp.d(bzuVar.e, 0);
                        lug lugVar4 = jsh.a;
                        jqxVar.e.j.put(str6, d);
                        String str7 = bzuVar.a;
                        jrp d2 = jrp.d(bzuVar.f, 0);
                        lug lugVar5 = jsh.a;
                        jvr jvrVar2 = jqxVar.f;
                        synchronized (jvrVar2.b) {
                            jvrVar2.k.put(str7, d2);
                        }
                        String str8 = bzuVar.a;
                        synchronized (jtq.b) {
                            jtq.a.remove(str8);
                        }
                    }
                }
            }
            return kcu.K(null);
        }
    }
}
