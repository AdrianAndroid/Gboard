package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: bcd  reason: default package */
/* loaded from: classes.dex */
public final class bcd {
    private static volatile boolean a = true;

    public static Drawable a(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (a) {
                return ej.a(theme != null ? new po(context2, theme) : context2, i);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return ur.a(context2, i);
            }
            throw e;
        } catch (NoClassDefFoundError unused2) {
            a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return vm.e(context2.getResources(), i, theme);
    }
}
