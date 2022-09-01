package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.IBinder;
import android.util.Log;
import android.view.animation.LinearInterpolator;
import com.google.android.libraries.search.p6glow.AssistantP6GlowView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: kht  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kht implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ kht(Context context, String str, int i) {
        this.c = i;
        this.a = context;
        this.b = str;
    }

    public kht(kdg kdgVar, ltq ltqVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = i;
        this.b = kdgVar;
        this.a = ltqVar;
    }

    public /* synthetic */ kht(kfu kfuVar, String str, int i) {
        this.c = i;
        this.a = kfuVar;
        this.b = str;
    }

    public /* synthetic */ kht(khu khuVar, nox noxVar, int i) {
        this.c = i;
        this.a = khuVar;
        this.b = noxVar;
    }

    public /* synthetic */ kht(kjj kjjVar, String str, int i) {
        this.c = i;
        this.a = kjjVar;
        this.b = str;
    }

    public /* synthetic */ kht(kkl kklVar, mko mkoVar, int i) {
        this.c = i;
        this.a = kklVar;
        this.b = mkoVar;
    }

    public kht(klz klzVar, okf okfVar, int i) {
        this.c = i;
        this.a = klzVar;
        this.b = okfVar;
    }

    public kht(kzz kzzVar, Set set, int i) {
        this.c = i;
        this.a = kzzVar;
        this.b = set;
    }

    public kht(laz lazVar, lbb lbbVar, int i) {
        this.c = i;
        this.a = lazVar;
        this.b = lbbVar;
    }

    public /* synthetic */ kht(lbs lbsVar, lbh lbhVar, int i) {
        this.c = i;
        this.b = lbsVar;
        this.a = lbhVar;
    }

    public /* synthetic */ kht(mkp mkpVar, jma jmaVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = i;
        this.b = mkpVar;
        this.a = jmaVar;
    }

    public /* synthetic */ kht(mnf mnfVar, moi moiVar, int i) {
        this.c = i;
        this.a = mnfVar;
        this.b = moiVar;
    }

    public /* synthetic */ kht(mni mniVar, moi moiVar, int i) {
        this.c = i;
        this.a = mniVar;
        this.b = moiVar;
    }

    public /* synthetic */ kht(nwl nwlVar, IBinder iBinder, int i) {
        this.c = i;
        this.b = nwlVar;
        this.a = iBinder;
    }

    public /* synthetic */ kht(nxl nxlVar, nvu nvuVar, int i) {
        this.c = i;
        this.b = nxlVar;
        this.a = nvuVar;
    }

    public kht(nzo nzoVar, Object obj, int i) {
        this.c = i;
        this.a = nzoVar;
        this.b = obj;
    }

    public kht(nzo nzoVar, StringBuilder sb, int i) {
        this.c = i;
        this.a = nzoVar;
        this.b = sb;
    }

    public kht(nzo nzoVar, nvu nvuVar, int i) {
        this.c = i;
        this.b = nzoVar;
        this.a = nvuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, okf] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, okf] */
    /* JADX WARN: Type inference failed for: r1v11, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v29, types: [moi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [nox, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [moi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, android.os.IBinder] */
    @Override // java.lang.Runnable
    public final void run() {
        Integer num;
        nvu a;
        switch (this.c) {
            case 0:
                ((khu) this.a).a(this.b);
                return;
            case 1:
                ((kfu) this.a).b.a.a(6, (String) this.b);
                return;
            case 2:
                Object obj = this.a;
                Object obj2 = this.b;
                SharedPreferences a2 = kkr.a((Context) obj);
                SharedPreferences.Editor editor = null;
                for (Map.Entry<String, ?> entry : a2.getAll().entrySet()) {
                    if ((entry.getValue() instanceof String) && entry.getValue().equals(obj2)) {
                        if (editor == null) {
                            editor = a2.edit();
                        }
                        editor.remove(entry.getKey());
                    }
                }
                if (editor == null) {
                    return;
                }
                editor.commit();
                return;
            case 3:
                Object obj3 = this.a;
                Object obj4 = this.b;
                if (Build.VERSION.SDK_INT < 26 || kkm.a(((kjj) obj3).c).containsKey(obj4)) {
                    return;
                }
                Log.e("PhenotypeCombinedFlags", "Config package " + ((String) obj4) + " cannot use PROCESS_STABLE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags.");
                return;
            case 4:
                ((kkl) this.a).d(this.b);
                return;
            case 5:
                Object obj5 = this.a;
                try {
                    kcu.S(this.b);
                    return;
                } catch (Exception e) {
                    String str = ((kkl) obj5).b;
                    Log.w("MobStoreFlagStore", "Failed to store account on flag read for: " + str + " which may lead to stale flags.", e);
                    return;
                }
            case 6:
                AssistantP6GlowView assistantP6GlowView = ((klz) this.a).a;
                LinearInterpolator linearInterpolator = klu.a;
                assistantP6GlowView.m(klu.f);
                this.b.a();
                return;
            case 7:
                ((klz) this.a).a.setAlpha(0.0f);
                this.b.a();
                return;
            case 8:
                Object obj6 = this.b;
                Object obj7 = this.a;
                if (!((mkp) obj6).isCancelled()) {
                    return;
                }
                ((CancellationSignal) ((jma) obj7).b).cancel();
                return;
            case 9:
                try {
                    ((kzz) this.a).a(this.b);
                    return;
                } catch (Exception e2) {
                    Log.e("SplitCompat", "Failed to remove from splitcompat storage split that is already installed", e2);
                    return;
                }
            case 10:
                lax laxVar = ((laz) this.a).a;
                lbb lbbVar = (lbb) this.b;
                List list = lbbVar.a;
                List h = laz.h(lbbVar.b);
                Bundle bundle = new Bundle();
                bundle.putInt("session_id", 0);
                bundle.putInt("status", 5);
                bundle.putInt("error_code", 0);
                if (!list.isEmpty()) {
                    bundle.putStringArrayList("module_names", new ArrayList<>(list));
                }
                if (!h.isEmpty()) {
                    bundle.putStringArrayList("languages", new ArrayList<>(h));
                }
                bundle.putLong("total_bytes_to_download", 0L);
                bundle.putLong("bytes_downloaded", 0L);
                laxVar.g(lbh.b(bundle));
                return;
            case 11:
                Object obj8 = this.b;
                Object obj9 = this.a;
                lbs lbsVar = (lbs) obj8;
                lbsVar.f.k(obj9);
                lbsVar.g.k(obj9);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((ConcurrentHashMap) ((kdg) this.b).a).remove(this.a);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj10 = this.a;
                ?? r1 = this.b;
                if (((mni) obj10).b != mni.a) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (obj10) {
                    ((mni) obj10).b = r1;
                }
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((mnf) this.a).c(this.b);
                return;
            case 15:
                Object obj11 = this.b;
                ?? r2 = this.a;
                synchronized (obj11) {
                    num = (Integer) ((nwl) obj11).k.c(nwl.f);
                }
                if (num == null) {
                    a = nvu.h.f("No remote UID available");
                } else {
                    a = ((nwl) obj11).b.a(num.intValue());
                }
                synchronized (obj11) {
                    if (((nwn) obj11).v(2)) {
                        if (!a.k()) {
                            ((nwn) obj11).p(a, true);
                        } else {
                            if (!((nwn) obj11).t(nxf.b(r2, ((nwl) obj11).a))) {
                                ((nwn) obj11).p(nvu.l.f("Failed to observe outgoing binder"), true);
                            } else if (!((nwn) obj11).s()) {
                                ((nwn) obj11).u(3);
                                ((nwl) obj11).d.b();
                            }
                        }
                    }
                }
                return;
            case 16:
                ((nxl) this.b).b((nvu) this.a);
                return;
            case 17:
                ((nxl) this.b).b((nvu) this.a);
                return;
            case 18:
                ((nzo) this.a).g(nvu.e.f(((StringBuilder) this.b).toString()), true);
                return;
            case 19:
                nsd nsdVar = ((nzo) this.b).b;
                nvu nvuVar = (nvu) this.a;
                nsdVar.b(nvuVar.p, nvuVar.q);
                return;
            default:
                ((nzo) this.a).b.e(this.b);
                return;
        }
    }
}
