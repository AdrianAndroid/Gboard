package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: fmx  reason: default package */
/* loaded from: classes.dex */
public final class fmx extends fmy {
    private static final Object e = new Object();
    public static final fmx a = new fmx();
    public static final int b = fmy.c;

    public final Dialog a(Context context, int i, fqy fqyVar, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(fqt.d(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c = fqt.c(context, i);
        if (c != null) {
            builder.setPositiveButton(c, fqyVar);
        }
        String g = fqt.g(context, i);
        if (g != null) {
            builder.setTitle(g);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i)), new IllegalArgumentException());
        return builder.create();
    }

    public final void b(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof ap) {
                bi hB = ((ap) activity).hB();
                fnp fnpVar = new fnp();
                fyb.aH(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener(null);
                dialog.setOnDismissListener(null);
                fnpVar.ac = dialog;
                if (onCancelListener != null) {
                    fnpVar.ad = onCancelListener;
                }
                fnpVar.n(hB, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        fmu fmuVar = new fmu();
        fyb.aH(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        fmuVar.a = dialog;
        if (onCancelListener != null) {
            fmuVar.b = onCancelListener;
        }
        fmuVar.show(fragmentManager, str);
    }

    public final void c(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null), new IllegalArgumentException());
        if (i == 18) {
            new fmw(this, context).sendEmptyMessageDelayed(1, 120000L);
        } else if (pendingIntent == null) {
            if (i != 6) {
                return;
            }
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        } else {
            String f = fqt.f(context, i);
            String e2 = fqt.e(context, i);
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            fyb.ax(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            uh uhVar = new uh(context);
            uhVar.n = true;
            uhVar.e(true);
            uhVar.g(f);
            ug ugVar = new ug();
            ugVar.a(e2);
            uhVar.j(ugVar);
            if (fyb.w(context)) {
                fyb.aD(true);
                uhVar.i(context.getApplicationInfo().icon);
                uhVar.h = 2;
                if (fyb.x(context)) {
                    uhVar.d(R.drawable.f46480_resource_name_obfuscated_res_0x7f080156, resources.getString(R.string.f149690_resource_name_obfuscated_res_0x7f140133), pendingIntent);
                } else {
                    uhVar.g = pendingIntent;
                }
            } else {
                uhVar.i(17301642);
                uhVar.r.tickerText = uh.c(resources.getString(R.string.f149610_resource_name_obfuscated_res_0x7f140129));
                uhVar.r.when = System.currentTimeMillis();
                uhVar.g = pendingIntent;
                uhVar.f(e2);
            }
            if (fyb.t()) {
                fyb.aD(fyb.t());
                synchronized (e) {
                }
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String b2 = fqt.b(context);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", b2, 4));
                } else if (!b2.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(b2);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                uhVar.p = "com.google.android.gms.availability";
            }
            Notification a2 = uhVar.a();
            if (i == 1 || i == 2 || i == 3) {
                fnn.b.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, a2);
        }
    }

    public final void d(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog a2 = a(activity, i, new fqw(g(activity, i, "d"), activity, i2), onCancelListener);
        if (a2 == null) {
            return;
        }
        b(activity, a2, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
