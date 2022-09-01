package defpackage;

import android.accounts.AccountManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.view.textservice.SpellCheckerInfo;
import android.view.textservice.TextServicesManager;
import com.google.android.inputmethod.latin.R;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;

/* compiled from: PG */
/* renamed from: kez  reason: default package */
/* loaded from: classes.dex */
public class kez {
    public static volatile int a;
    private static volatile int b;

    public kez() {
    }

    public kez(Context context) {
        context.getPackageName();
        AccountManager.get(context);
    }

    public static lfb a(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return ldu.a;
        }
        int i = b;
        if (i == 0) {
            synchronized (kez.class) {
                i = b;
                if (i == 0) {
                    int round = Math.round(((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getRefreshRate());
                    b = round;
                    i = round;
                }
            }
        }
        return lfb.g(Integer.valueOf(i));
    }

    public static int b(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static long e(long j, int i, int i2) {
        return (j << i) | (((-1) >>> (64 - i)) & i2);
    }

    public static String f(InputStream inputStream, long j, int i) {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStream.skip(j);
            if (i <= 0) {
                i = Integer.MAX_VALUE;
            }
            while (i > 0) {
                int read = inputStream.read(bArr, 0, Math.min(i, 1024));
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
                i -= read;
            }
            inputStream.close();
            try {
                return byteArrayOutputStream.toString("UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("Unsupported encoding UTF8. This should always be supported.", e);
            }
        } catch (IOException e2) {
            throw new RuntimeException("Failed to read license or metadata text.", e2);
        }
    }

    public static String g(Context context, String str, long j, int i) {
        Resources resources = context.getApplicationContext().getResources();
        return f(resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(R.id.f54040_resource_name_obfuscated_res_0x7f0b0176))), j, i);
    }

    public static String h(ZipEntry zipEntry) {
        String name = zipEntry.getName();
        if (name.contains("..")) {
            for (File file = new File(name); file != null; file = file.getParentFile()) {
                if (file.getName().equals("..")) {
                    throw new ZipException("Illegal name: ".concat(String.valueOf(name)));
                }
            }
        }
        return name;
    }

    public static Object i(Callable callable) {
        try {
            return callable.call();
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    public static int j(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int k(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int l(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int m(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static EditorInfo n() {
        EditorInfo c = hsu.c();
        return c == null ? hsu.b() : c;
    }

    public static boolean o(int i) {
        return ((1 << Character.getType(i)) & 1634758656) != 0;
    }

    public static boolean p(Context context, TextServicesManager textServicesManager) {
        if (!li.e()) {
            return false;
        }
        try {
            SpellCheckerInfo currentSpellCheckerInfo = textServicesManager.getCurrentSpellCheckerInfo();
            if (currentSpellCheckerInfo != null) {
                if (TextUtils.equals(context.getPackageName(), currentSpellCheckerInfo.getPackageName())) {
                    return true;
                }
            }
        } catch (NoSuchMethodError unused) {
        }
        return false;
    }

    public static boolean q(EditorInfo editorInfo) {
        if (editorInfo == null) {
            return false;
        }
        return ham.ae(editorInfo);
    }

    public static boolean r() {
        return s(hqp.b());
    }

    public static boolean s(hqt hqtVar) {
        String str;
        if (hqtVar == null) {
            return true;
        }
        jav i = hqtVar.i();
        if (i != null && (str = i.g) != null) {
            if ("ja".equals(str)) {
                if (!((Boolean) iqt.d.c()).booleanValue()) {
                    return false;
                }
            } else if (str.equals("zh") || str.equals("ko")) {
                return false;
            }
        }
        return !hqtVar.p().contains("morse");
    }

    public static boolean t(Context context) {
        TextServicesManager textServicesManager;
        return u(context) && (textServicesManager = (TextServicesManager) context.getSystemService("textservices")) != null && li.e() && textServicesManager.isSpellCheckerEnabled() && p(context, textServicesManager);
    }

    public static boolean u(Context context) {
        EditorInfo n = n();
        if (!li.e() || !ino.M(context).aj(R.string.f161950_resource_name_obfuscated_res_0x7f1406e4) || !((Boolean) iqt.b.c()).booleanValue() || !hsx.d() || !r()) {
            return false;
        }
        return !q(n) || ((Boolean) iqt.c.c()).booleanValue();
    }
}
