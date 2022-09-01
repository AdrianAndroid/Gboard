package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import com.google.android.inputmethod.latin.R;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: vm  reason: default package */
/* loaded from: classes2.dex */
public final class vm {
    private static final ThreadLocal a = new ThreadLocal();
    private static final WeakHashMap b = new WeakHashMap(0);
    private static final Object c = new Object();

    public static ColorStateList a(Resources resources, int i, Resources.Theme theme) {
        ColorStateList colorStateList;
        Object obj;
        nwo nwoVar;
        Resources.Theme theme2;
        vi viVar = new vi(resources, theme);
        synchronized (c) {
            SparseArray sparseArray = (SparseArray) b.get(viVar);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0 && (nwoVar = (nwo) sparseArray.get(i)) != null) {
                if (!((Configuration) nwoVar.b).equals(viVar.a.getConfiguration()) || (!((theme2 = viVar.b) == null && nwoVar.a == 0) && (theme2 == null || nwoVar.a != theme2.hashCode()))) {
                    sparseArray.remove(i);
                } else {
                    obj = nwoVar.c;
                }
            }
            obj = null;
        }
        if (obj == null) {
            TypedValue h = h();
            resources.getValue(i, h, true);
            if (h.type < 28 || h.type > 31) {
                try {
                    colorStateList = uz.a(resources, resources.getXml(i), theme);
                } catch (Exception e) {
                    Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
                }
            }
            if (colorStateList != null) {
                synchronized (c) {
                    WeakHashMap weakHashMap = b;
                    SparseArray sparseArray2 = (SparseArray) weakHashMap.get(viVar);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        weakHashMap.put(viVar, sparseArray2);
                    }
                    sparseArray2.append(i, new nwo(colorStateList, viVar.a.getConfiguration(), theme));
                }
                return colorStateList;
            }
            return vg.b(resources, i, theme);
        }
        return (ColorStateList) obj;
    }

    public static Typeface b(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return i(context, i, new TypedValue(), 0, null, false, true);
    }

    public static Typeface c(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return i(context, i, new TypedValue(), 0, null, false, false);
    }

    public static Typeface d(Context context, int i, TypedValue typedValue, int i2, vj vjVar) {
        if (context.isRestricted()) {
            return null;
        }
        return i(context, i, typedValue, i2, vjVar, true, false);
    }

    public static Drawable e(Resources resources, int i, Resources.Theme theme) {
        return vf.a(resources, i, theme);
    }

    public static float f(Resources resources) {
        if (Build.VERSION.SDK_INT >= 29) {
            return vh.a(resources, R.dimen.f32300_resource_name_obfuscated_res_0x7f070073);
        }
        TypedValue h = h();
        resources.getValue(R.dimen.f32300_resource_name_obfuscated_res_0x7f070073, h, true);
        if (h.type == 4) {
            return h.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(R.dimen.f32300_resource_name_obfuscated_res_0x7f070073) + " type #0x" + Integer.toHexString(h.type) + " is not valid");
    }

    public static void g(Context context, int i, vj vjVar) {
        if (context.isRestricted()) {
            vjVar.c(-4);
        } else {
            i(context, i, new TypedValue(), 0, vjVar, false, false);
        }
    }

    private static TypedValue h() {
        ThreadLocal threadLocal = a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    private static Typeface i(Context context, int i, TypedValue typedValue, int i2, vj vjVar, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface j = j(context, resources, typedValue, i, i2, vjVar, z, z2);
        if (j == null && vjVar == null && !z2) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017c A[Catch: IOException -> 0x01b9, XmlPullParserException -> 0x01c8, TryCatch #2 {IOException -> 0x01b9, XmlPullParserException -> 0x01c8, blocks: (B:17:0x0041, B:19:0x004d, B:20:0x0051, B:25:0x005c, B:26:0x0063, B:28:0x0064, B:30:0x0071, B:34:0x00a7, B:36:0x00ae, B:38:0x00b2, B:41:0x017c, B:43:0x0183, B:46:0x0189, B:48:0x00c3, B:49:0x00c8, B:51:0x00cf, B:54:0x00d6, B:61:0x00e2, B:64:0x00f6, B:67:0x0105, B:70:0x0111, B:73:0x011a, B:76:0x0122, B:79:0x0135, B:80:0x0140, B:82:0x0147, B:84:0x014b, B:57:0x0157, B:91:0x015f, B:95:0x0166, B:96:0x0176, B:97:0x019d, B:100:0x01b0, B:101:0x01b4), top: B:16:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0189 A[Catch: IOException -> 0x01b9, XmlPullParserException -> 0x01c8, TryCatch #2 {IOException -> 0x01b9, XmlPullParserException -> 0x01c8, blocks: (B:17:0x0041, B:19:0x004d, B:20:0x0051, B:25:0x005c, B:26:0x0063, B:28:0x0064, B:30:0x0071, B:34:0x00a7, B:36:0x00ae, B:38:0x00b2, B:41:0x017c, B:43:0x0183, B:46:0x0189, B:48:0x00c3, B:49:0x00c8, B:51:0x00cf, B:54:0x00d6, B:61:0x00e2, B:64:0x00f6, B:67:0x0105, B:70:0x0111, B:73:0x011a, B:76:0x0122, B:79:0x0135, B:80:0x0140, B:82:0x0147, B:84:0x014b, B:57:0x0157, B:91:0x015f, B:95:0x0166, B:96:0x0176, B:97:0x019d, B:100:0x01b0, B:101:0x01b4), top: B:16:0x0041 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface j(android.content.Context r23, android.content.res.Resources r24, android.util.TypedValue r25, int r26, int r27, defpackage.vj r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vm.j(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, vj, boolean, boolean):android.graphics.Typeface");
    }
}
