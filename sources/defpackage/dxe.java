package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import com.google.android.apps.inputmethod.libs.expression.emojisearch.EmojiSearchJniImpl;
import com.google.android.enterprise.connectedapps.internal.BundleCallReceiver;
import com.google.android.inputmethod.latin.R;
import java.util.List;

/* compiled from: PG */
/* renamed from: dxe  reason: default package */
/* loaded from: classes.dex */
public final class dxe {
    public final Object a;

    public dxe() {
        this.a = new EmojiSearchJniImpl();
    }

    public dxe(Context context) {
        this.a = context;
    }

    public dxe(Context context, byte[] bArr) {
        this.a = ino.M(context);
    }

    public dxe(Delight5Facilitator delight5Facilitator) {
        this.a = delight5Facilitator;
    }

    public dxe(String str) {
        this.a = str;
    }

    public static boolean e() {
        return ((Boolean) dsu.h.c()).booleanValue() && irs.d();
    }

    public final boolean a() {
        return ino.M((Context) this.a).x(R.string.f160790_resource_name_obfuscated_res_0x7f14066f, true);
    }

    public final boolean b() {
        return d() && c();
    }

    public final boolean c() {
        return ino.M((Context) this.a).x(R.string.f160780_resource_name_obfuscated_res_0x7f14066e, true);
    }

    public final boolean d() {
        return ino.M((Context) this.a).x(R.string.f161110_resource_name_obfuscated_res_0x7f14068f, true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, cne] */
    public final llp f(List list) {
        return llp.o(lre.H(this.a.c(list).a, dzr.l));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, cne] */
    public final void g(Context context) {
        hrx.y(context);
        this.a.a(context, cuz.m());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, cne] */
    public final void h() {
        this.a.b();
    }

    public final void i(int i) {
        ((aia) this.a).h("pref_key_active_emoji_recent_category", i);
    }

    public final byte[] j(Context context, long j, int i, long j2, int i2, byte[] bArr, fjr fjrVar) {
        Bundle a;
        try {
            Bundle preparedCall = ((BundleCallReceiver) this.a).getPreparedCall(j, i, bArr);
            if (j2 != 2496128067178147232L && j2 != -3501682228218438129L) {
                throw new IllegalArgumentException("Unknown type identifier " + j2);
            }
            Context applicationContext = context.getApplicationContext();
            if (j2 != 2496128067178147232L) {
                fkh[] fkhVarArr = jev.a.c;
                if (i2 < 9) {
                    a = fkhVarArr[i2].a(applicationContext, preparedCall, fjrVar);
                } else {
                    throw new IllegalArgumentException("Invalid method identifier" + i2);
                }
            } else {
                fkh[] fkhVarArr2 = jeh.a.c;
                if (i2 < 5) {
                    a = fkhVarArr2[i2].a(applicationContext, preparedCall, fjrVar);
                } else {
                    throw new IllegalArgumentException("Invalid method identifier" + i2);
                }
            }
            return ((BundleCallReceiver) this.a).prepareResponse(j, a);
        } catch (Error e) {
            Bundle bundle = new Bundle(fkd.class.getClassLoader());
            fgy.c(bundle, e);
            byte[] prepareResponse = ((BundleCallReceiver) this.a).prepareResponse(j, bundle);
            new Handler(Looper.getMainLooper()).postDelayed(new mlf(1), 1000L);
            return prepareResponse;
        } catch (RuntimeException e2) {
            Bundle bundle2 = new Bundle(fkd.class.getClassLoader());
            fgy.c(bundle2, e2);
            byte[] prepareResponse2 = ((BundleCallReceiver) this.a).prepareResponse(j, bundle2);
            new Handler(Looper.getMainLooper()).postDelayed(new mlf(e2, 1), 1000L);
            return prepareResponse2;
        }
    }

    public final boolean k() {
        return Build.VERSION.SDK_INT >= 26 && !fji.c((Context) this.a);
    }

    public final boolean l() {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        return fji.c((Context) this.a);
    }

    public dxe(Context context, byte[] bArr, byte[] bArr2) {
        this.a = new kcq(context, (byte[]) null, (byte[]) null);
    }

    public dxe(Context context, char[] cArr) {
        context.getClass();
        this.a = context;
    }

    public dxe(byte[] bArr) {
        this.a = new BundleCallReceiver();
    }
}
