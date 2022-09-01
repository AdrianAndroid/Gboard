package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import j$.util.DesugarTimeZone;
import j$.util.function.Function;
import j$.util.function.Predicate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: fgy  reason: default package */
/* loaded from: classes.dex */
public class fgy {
    public static volatile nuq a;
    public static volatile nuq b;
    public static volatile nuq c;
    public static volatile nuq d;
    public static volatile nuq e;
    public static volatile nuq f;

    public static void a(View view, ibz ibzVar, boolean z) {
        if (view == null) {
            return;
        }
        int i = 8;
        if (view.getId() == R.id.f128940_resource_name_obfuscated_res_0x7f0b211a) {
            if (true == z) {
                i = 0;
            }
            view.setVisibility(i);
        } else if (view.getId() == R.id.key_pos_non_prime_category_1 && ibzVar == ibz.c) {
            if (true != z) {
                i = 0;
            }
            view.setVisibility(i);
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            a(viewGroup.getChildAt(i2), ibzVar, z);
        }
    }

    public static Throwable b(Bundle bundle) {
        bundle.setClassLoader(fkd.class.getClassLoader());
        return (Throwable) bundle.getSerializable("throwable");
    }

    public static void c(Bundle bundle, Throwable th) {
        bundle.putSerializable("throwable", th);
    }

    public static int d(int i) {
        return i - 2;
    }

    public static String e(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            default:
                return "unknown status code: " + i;
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return "ERROR";
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static boolean h(Context context) {
        return !"tablet".equals(gzq.b(context, true)) && fhr.w(context);
    }

    public static boolean i(Context context) {
        if (!h(context)) {
            return false;
        }
        return jbt.B(context, R.string.f175310_resource_name_obfuscated_res_0x7f140c61, false) || !hrx.y(context).p();
    }

    public static void j(View view) {
        hxk.a(view.getContext()).c(view, null);
    }

    public static long k(long j) {
        return t(j).getTimeInMillis();
    }

    public static long l(long j, int i) {
        Calendar t = t(j);
        t.add(2, i);
        return t.getTimeInMillis();
    }

    public static Predicate m(Function function) {
        return new dsp(new HashSet(), function, 1);
    }

    public static llp n(Iterable iterable, lfe lfeVar) {
        return llp.i(lre.Z(iterable, lfeVar));
    }

    public static llp o(Iterable iterable) {
        ArrayList B = lre.B(iterable);
        Collections.shuffle(B);
        return llp.o(B);
    }

    public static llp p(Iterable iterable, leq leqVar) {
        return llp.i(lre.ab(iterable, leqVar));
    }

    public static ify q() {
        ify a2 = igb.a();
        a2.b = R.string.f175200_resource_name_obfuscated_res_0x7f140c56;
        a2.a = new iiy[]{gwz.b};
        return a2;
    }

    public static ibz s(Context context, int i) {
        return ibz.a(context.getString(i));
    }

    private static Calendar t(long j) {
        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        calendar.clear();
        calendar.setFirstDayOfWeek(2);
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.set(5, 1);
        return calendar;
    }

    @Deprecated
    public fnw f(Context context, Looper looper, fqs fqsVar, Object obj, fob fobVar, foc focVar) {
        return g(context, looper, fqsVar, obj, fobVar, focVar);
    }

    public fnw g(Context context, Looper looper, fqs fqsVar, Object obj, fpb fpbVar, fpw fpwVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
