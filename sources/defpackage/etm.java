package defpackage;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.PowerManager;
import android.os.Vibrator;
import android.text.TextUtils;
import j$.util.Objects;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: etm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class etm implements lgb {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ etm(Activity activity, int i) {
        this.b = i;
        this.a = activity;
    }

    public /* synthetic */ etm(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    public /* synthetic */ etm(eul eulVar, int i) {
        this.b = i;
        this.a = eulVar;
    }

    public /* synthetic */ etm(gmk gmkVar, int i) {
        this.b = i;
        this.a = gmkVar;
    }

    public /* synthetic */ etm(gms gmsVar, int i) {
        this.b = i;
        this.a = gmsVar;
    }

    public /* synthetic */ etm(gpa gpaVar, int i) {
        this.b = i;
        this.a = gpaVar;
    }

    public /* synthetic */ etm(hci hciVar, int i) {
        this.b = i;
        this.a = hciVar;
    }

    public /* synthetic */ etm(AtomicBoolean atomicBoolean, int i) {
        this.b = i;
        this.a = atomicBoolean;
    }

    public /* synthetic */ etm(ngz ngzVar, int i) {
        this.b = i;
        this.a = ngzVar;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [ngz, java.lang.Object] */
    @Override // defpackage.lgb
    public final Object a() {
        switch (this.b) {
            case 0:
                return ((eul) this.a).a();
            case 1:
                return ((eul) this.a).b();
            case 2:
                Object obj = this.a;
                lgb lgbVar = evw.a;
                return fay.k(((Context) obj).getApplicationContext());
            case 3:
                Object obj2 = this.a;
                lgb lgbVar2 = evw.a;
                return fay.k(((Context) obj2).getApplicationContext());
            case 4:
                return this.a.n();
            case 5:
                return new fvl((Activity) this.a);
            case 6:
                return Boolean.valueOf(((AtomicBoolean) this.a).get());
            case 7:
                gmk gmkVar = (gmk) this.a;
                gmi gmiVar = gmkVar.f;
                gms gmsVar = gmkVar.e;
                Objects.requireNonNull(gmsVar);
                return mio.g(gmiVar.b(new etm(gmsVar, 8)), new ebi(gmkVar, 18), mjl.a);
            case 8:
                gms gmsVar2 = (gms) this.a;
                if (gmsVar2.b()) {
                    gmsVar2.c.unlock();
                    return gmsVar2.a();
                }
                return kcu.K(gmm.a);
            case 9:
                return this.a;
            case 10:
                Object obj3 = this.a;
                ltg ltgVar = gqa.a;
                return (AudioManager) ((Context) obj3).getSystemService("audio");
            case 11:
                Object obj4 = this.a;
                ltg ltgVar2 = gqa.a;
                return (PowerManager) ((Context) obj4).getSystemService("power");
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj5 = this.a;
                ltg ltgVar3 = gwj.a;
                return new gwh(jam.j(), jam.e((Context) obj5));
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj6 = this.a;
                ltg ltgVar4 = har.a;
                gwg a = gwj.a((Context) obj6, "BundledEmojiListLoader");
                a.c();
                a.b();
                return new gwk(a.a(), new haq(2));
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj7 = this.a;
                ltg ltgVar5 = har.a;
                gwg a2 = gwj.a((Context) obj7, "BundledEmojiListLoader");
                a2.c();
                a2.b();
                return new gwk(a2.a(), new haq(0));
            case 15:
                hdj hdjVar = (hdj) ((hci) this.a).d.get();
                if (hdjVar == null) {
                    return null;
                }
                return hdjVar.c();
            case 16:
                hdj c = ((hci) this.a).c();
                if (c == null) {
                    return null;
                }
                return c.c();
            case 17:
                return fyb.e((Context) this.a).a(fyb.f());
            case 18:
                return (AudioManager) ((Context) this.a).getSystemService("audio");
            case 19:
                return (Vibrator) ((Context) this.a).getSystemService("vibrator");
            default:
                Object obj8 = this.a;
                String str = String.valueOf(jbt.m((Context) obj8).getFilesDir()) + File.separator + "ncrash";
                try {
                    if (jbe.c((Context) obj8)) {
                        return str;
                    }
                    String b = jbe.b((Context) obj8);
                    if (true == TextUtils.isEmpty(b)) {
                        b = "unknown";
                    }
                    return str + "_" + b;
                } catch (RuntimeException e) {
                    ((ltd) ((ltd) ((ltd) hye.a.c()).i(e)).k("com/google/android/libraries/inputmethod/lethe/CrashDataStore", "getNativeCrashDirInternal", (char) 285, "CrashDataStore.java")).t("Failed to get native crash dir for sub process.");
                    return str;
                }
        }
    }
}
