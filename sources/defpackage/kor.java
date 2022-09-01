package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: kor  reason: default package */
/* loaded from: classes.dex */
public final class kor {
    private final Context a;
    private final String b;
    private String c = "files";
    private String d = "common";
    private Account e = kos.b;
    private String f = "";
    private final llk g = llp.e();

    public kor(Context context) {
        kqn.d(context != null, "Context cannot be null", new Object[0]);
        this.a = context;
        this.b = context.getPackageName();
    }

    public final Uri a() {
        return new Uri.Builder().scheme("android").authority(this.b).path("/" + this.c + "/" + this.d + "/" + kop.b(this.e) + "/" + this.f).encodedFragment(kpg.b(this.g.g())).build();
    }

    public final void b(String str) {
        String str2;
        String str3;
        String substring;
        File e = kki.e(this.a);
        String absolutePath = e.getAbsolutePath();
        String absolutePath2 = this.a.getCacheDir().getAbsolutePath();
        String absolutePath3 = new File(e, "managed").getAbsolutePath();
        File externalFilesDir = this.a.getExternalFilesDir(null);
        String absolutePath4 = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
        if (Build.VERSION.SDK_INT >= 24) {
            File d = kki.d(this.a);
            str3 = new File(d, "files").getAbsolutePath();
            str2 = new File(d, "cache").getAbsolutePath();
        } else {
            str2 = null;
            str3 = null;
        }
        if (str.startsWith(absolutePath3)) {
            c("managed");
            substring = str.substring(absolutePath3.length());
        } else if (str.startsWith(absolutePath)) {
            c("files");
            substring = str.substring(absolutePath.length());
        } else if (str.startsWith(absolutePath2)) {
            c("cache");
            substring = str.substring(absolutePath2.length());
        } else if (absolutePath4 == null || !str.startsWith(absolutePath4)) {
            if (str3 == null || !str.startsWith(str3)) {
                if (str2 == null || !str.startsWith(str2)) {
                    throw new IllegalArgumentException("Path must be in app-private files dir or external files dir: ".concat(String.valueOf(str)));
                }
                c("directboot-cache");
                substring = str.substring(str2.length());
            } else {
                c("directboot-files");
                substring = str.substring(str3.length());
            }
        } else {
            c("external");
            substring = str.substring(absolutePath4.length());
        }
        List asList = Arrays.asList(substring.split(File.separator));
        kqn.d(asList.size() >= 3, "Path must be in module and account subdirectories: %s", str);
        d((String) asList.get(1));
        String str4 = (String) asList.get(2);
        if (!"managed".equals(this.c) || kop.d(str4)) {
            Account a = kop.a(str4);
            kop.b(a);
            this.e = a;
            e(substring.substring(this.d.length() + str4.length() + 2));
            return;
        }
        try {
            Integer.parseInt(str4);
            kqn.d(false, "AccountManager cannot be null", new Object[0]);
            try {
                throw null;
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalArgumentException(new koy(e2));
            } catch (ExecutionException e3) {
                throw new IllegalArgumentException(new koy(e3.getCause()));
            }
        } catch (NumberFormatException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public final void c(String str) {
        kqn.d(kos.d.contains(str), "The only supported locations are %s: %s", kos.d, str);
        this.c = str;
    }

    public final void d(String str) {
        kqn.d(kos.a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        kqn.d(!kos.c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.d = str;
    }

    public final void e(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = kos.a;
        this.f = str;
    }
}
