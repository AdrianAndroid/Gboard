package defpackage;

import android.content.Context;
import androidx.viewpager.widget.ViewPager;
import com.google.android.libraries.inputmethod.staticflag.AllFlags;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: jlr  reason: default package */
/* loaded from: classes.dex */
public final class jlr {
    public final Object a;

    public jlr(Context context) {
        this.a = context.getApplicationContext();
    }

    public jlr(ViewPager viewPager) {
        this.a = viewPager;
    }

    public jlr(kqp kqpVar) {
        this.a = kqpVar;
    }

    public jlr(krj krjVar) {
        this.a = krjVar;
    }

    public static jlr b() {
        return new jlr();
    }

    public final mko a(mix mixVar, Executor executor) {
        return ((ndi) ((kcl) this.a).a).b(ldd.b(mixVar), executor);
    }

    public final boolean c() {
        if (lmz.w("com.android.vending", "com.google.android.GoogleCamera", "com.google.android.GoogleCameraEng", "com.google.android.apps.docs", "com.google.android.apps.docs.editors.docs", "com.google.android.apps.docs.editors.sheets", "com.google.android.apps.docs.editors.slides", "com.google.android.apps.geo.food.omniapp.nomni", "com.google.android.apps.gmail.testing.unit", "com.google.android.apps.gmm", "com.google.android.apps.gmm.ads.label.testing.app", "com.google.android.apps.gmm.search.map.testing.app", "com.google.android.apps.googlecamera.fishfood", "com.google.android.apps.jamkiosk", "com.google.android.apps.messaging", "com.google.android.apps.tasks", "com.google.android.apps.tasks.ui.scuba", "com.google.android.apps.work.clouddpc", "com.google.android.apps.work.clouddpc.arc", "com.google.android.apps.youtube.creator", "com.google.android.apps.youtube.kids", "com.google.android.apps.youtube.mango", "com.google.android.apps.youtube.music", "com.google.android.apps.youtube.unplugged", "com.google.android.apps.youtube.vr", "com.google.android.apps.youtube.vr.oculus", "com.google.android.gms", "com.google.android.googlequicksearchbox", AllFlags.STATICMENDELPACKAGENAME, "com.google.android.inputmethod.latin.canary", "com.google.android.inputmethod.latin.dev", "com.google.android.play.games", "com.google.android.youtube", "com.google.android.youtube.test", "com.google.android.youtube.tv", "com.google.android.youtube.tvkids", "com.google.android.youtube.tvunplugged", "com.google.intelligence.sense.ambientmusic.functional.emulator", "com.google.intelligence.sense.ambientmusic.history.functional").contains(this.a)) {
            return true;
        }
        return lmz.w("com.google.android.apps.accessibility.reveal", "com.google.android.apps.adwords", "com.google.android.apps.adwords.devel", "com.google.android.apps.adwords.dogfood", "com.google.android.apps.adwords.fishfood", "com.google.android.apps.adwords.nightly", "com.google.android.apps.diagnosticstool", "com.google.android.apps.dragonfly", "com.google.android.apps.dynamite", "com.google.android.apps.gmm.home.cards.yourexplore", "com.google.android.apps.internal.admobsdk.mediumtest.stability", "com.google.android.apps.nbu.paisa.user.integration.home", "com.google.android.apps.nbu.paisa.user.integration.homescreen", "com.google.android.apps.nbu.paisa.user.integration.microapp", "com.google.android.apps.nbu.paisa.user.integration.qrcode", "com.google.android.apps.searchlite.homescreen", "com.google.android.flutter.testing.integrationtest.skeleton", "com.google.android.libraries.performance.primes.sample.profiling.application", "com.google.android.marvin.talkback", "com.google.android.street").contains(this.a);
    }

    public final synchronized int d(Object obj) {
        lig ligVar = ((lhj) this.a).a;
        int a = ligVar.a(obj);
        Integer num = (Integer) ligVar.b(a).c(obj, a);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final synchronized void e(Object obj) {
        ((lhj) this.a).a.remove(obj);
    }

    public final synchronized void f() {
        ((lhj) this.a).a.clear();
    }

    public final synchronized boolean g(Object obj, jyw jywVar) {
        boolean z;
        int d = d(obj);
        int i = 0;
        z = d == -1;
        if (z) {
            ((jyy) jywVar.a).g((jsx) jywVar.b, 0);
        }
        Object obj2 = this.a;
        if (!z) {
            i = d + 1;
        }
        ((lhj) obj2).a.put(obj, Integer.valueOf(i));
        return z;
    }

    private jlr() {
        this.a = new kcl((byte[]) null, (byte[]) null, (byte[]) null);
    }

    public jlr(long j, final jnf jnfVar) {
        lgo b = lgo.b();
        b.e(1);
        b.f(j, TimeUnit.MILLISECONDS);
        b.g(4L);
        b.h(new lij() { // from class: jrq
            @Override // defpackage.lij
            public final void a(lik likVar) {
                jnf jnfVar2 = jnf.this;
                lii liiVar = likVar.a;
                if (liiVar == lii.EXPIRED || liiVar == lii.EXPLICIT || liiVar == lii.COLLECTED) {
                    jnfVar2.a(likVar.getKey());
                }
            }
        });
        this.a = b.a();
    }

    public jlr(Context context, byte[] bArr) {
        this.a = context.getPackageName();
    }

    public jlr(byte[] bArr) {
        this.a = Collections.synchronizedSet(new HashSet());
    }
}
