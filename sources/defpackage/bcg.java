package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* renamed from: bcg  reason: default package */
/* loaded from: classes.dex */
public final class bcg implements avc {
    public static final auz a = auz.b("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");
    private final Context b;

    public bcg(Context context) {
        this.b = context.getApplicationContext();
    }

    @Override // defpackage.avc
    public final /* bridge */ /* synthetic */ axh a(Object obj, int i, int i2, ava avaVar) {
        return c((Uri) obj, avaVar);
    }

    @Override // defpackage.avc
    public final /* bridge */ /* synthetic */ boolean b(Object obj, ava avaVar) {
        return ((Uri) obj).getScheme().equals("android.resource");
    }

    public final axh c(Uri uri, ava avaVar) {
        Context context;
        int parseInt;
        Drawable a2;
        String authority = uri.getAuthority();
        boolean z = false;
        if (authority.equals(this.b.getPackageName())) {
            context = this.b;
        } else {
            try {
                context = this.b.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (!authority.contains(this.b.getPackageName())) {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: ".concat(String.valueOf(String.valueOf(uri))), e);
                }
                context = this.b;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            parseInt = context.getResources().getIdentifier(str2, str, authority2);
            if (parseInt == 0) {
                parseInt = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (parseInt == 0) {
                throw new IllegalArgumentException("Failed to find resource id for: ".concat(String.valueOf(String.valueOf(uri))));
            }
        } else if (pathSegments.size() != 1) {
            throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(String.valueOf(uri))));
        } else {
            try {
                parseInt = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(String.valueOf(uri))), e2);
            }
        }
        Resources.Theme theme = (Resources.Theme) avaVar.b(a);
        if (context.getPackageName().equals(authority) || theme == null) {
            z = true;
        }
        ce.n(z, "Can't get a theme from another package");
        if (theme == null) {
            a2 = bcd.a(this.b, context, parseInt, null);
        } else {
            Context context2 = this.b;
            a2 = bcd.a(context2, context2, parseInt, theme);
        }
        return bcf.g(a2);
    }
}
