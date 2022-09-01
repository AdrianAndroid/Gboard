package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.util.Printer;

/* compiled from: PG */
/* renamed from: irn  reason: default package */
/* loaded from: classes.dex */
public class irn implements ijh {
    private static final ltg a = ltg.j("com/google/android/libraries/inputmethod/statusmonitors/ConfigurationNotification");
    private final Configuration b;
    private final Configuration c;
    private final String d;
    private final String e;

    private irn(Configuration configuration, Configuration configuration2, String str, String str2) {
        this.b = configuration;
        this.c = configuration2;
        this.d = str;
        this.e = str2;
    }

    public static Configuration c() {
        irn irnVar = (irn) ijl.b().a(irn.class);
        if (irnVar != null) {
            return irnVar.b();
        }
        return null;
    }

    public static String d() {
        irn irnVar = (irn) ijl.b().a(irn.class);
        if (irnVar == null) {
            ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/statusmonitors/ConfigurationNotification", "getCurrentDeviceMode", 171, "ConfigurationNotification.java")).t("device mode is unknown before initializing the notification.");
            return "unknown";
        }
        return irnVar.e();
    }

    public static void f(Context context) {
        synchronized (irn.class) {
            irn irnVar = (irn) ijl.b().a(irn.class);
            String b = gzq.b(context, true);
            ijl b2 = ijl.b();
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            String str = null;
            Configuration configuration2 = irnVar != null ? irnVar.c : null;
            if (irnVar != null) {
                str = irnVar.e;
            }
            b2.g(new irn(configuration, configuration2, b, str));
            if (b.equals("foldable") && !ino.L().ak("is_foldable_device")) {
                ino.L().f("is_foldable_device", true);
            }
        }
    }

    public static void g(Context context) {
        String str;
        Configuration configuration = null;
        Configuration configuration2 = context != null ? context.getResources().getConfiguration() : null;
        synchronized (irn.class) {
            irn irnVar = (irn) ijl.b().a(irn.class);
            if (irnVar == null) {
                ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/statusmonitors/ConfigurationNotification", "notifyInputMethodServiceConfigurationChanged", 112, "ConfigurationNotification.java")).t("Application is not created!");
            }
            if (configuration2 != null) {
                configuration2 = new Configuration(configuration2);
            }
            String a2 = context != null ? gzq.a(context) : null;
            if (a2 != null && a2.equals("foldable") && !ino.L().ak("is_foldable_device")) {
                ino.L().f("is_foldable_device", true);
            }
            if (irnVar != null) {
                configuration = irnVar.b;
                str = irnVar.d;
            } else if (context != null) {
                configuration = new Configuration(context.getApplicationContext().getResources().getConfiguration());
                str = gzq.a(context.getApplicationContext());
            } else {
                str = null;
            }
            if (configuration != null) {
                ijl.b().g(new irn(configuration, configuration2, str, a2));
            }
        }
    }

    @Override // defpackage.ijg
    public final boolean a() {
        return true;
    }

    public final Configuration b() {
        Configuration configuration = this.c;
        return configuration != null ? configuration : this.b;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("Device mode: ".concat(e()));
        printer.println("Configuration: ".concat(b().toString()));
    }

    public final String e() {
        String str = this.e;
        return str != null ? str : this.d;
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "ConfigurationNotification";
    }
}
