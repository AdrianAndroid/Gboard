package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: imx  reason: default package */
/* loaded from: classes.dex */
public final class imx implements imv {
    private static final lug b = hin.a;
    public final Map a = new qo();
    private final jls c;

    public imx(jls jlsVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = jlsVar;
    }

    @Override // defpackage.imv
    public final void a(int i, boolean z) {
        this.a.put(this.c.n(i), Boolean.valueOf(z));
    }

    @Override // defpackage.imv
    public final void b(int i, float f) {
        this.a.put(this.c.n(i), Float.valueOf(f));
    }

    @Override // defpackage.imv
    public final void c(int i, int i2) {
        this.a.put(this.c.n(i), Integer.valueOf(i2));
    }

    @Override // defpackage.imv
    public final void d(int i, String str) {
        this.a.put(this.c.n(i), str);
    }

    @Override // defpackage.imv
    public final void e(int i, Set set) {
        this.a.put(this.c.n(i), set);
    }

    @Override // defpackage.imv
    public final boolean f(int i) {
        return this.a.containsKey(this.c.n(i));
    }

    public final void g(int i) {
        try {
            int[] iArr = imw.a;
            Object obj = this.c.b;
            TypedArray obtainTypedArray = ((Resources) obj).obtainTypedArray(i);
            int length = obtainTypedArray.length();
            int i2 = 0;
            while (i2 < length) {
                int resourceId = obtainTypedArray.getResourceId(i2, 0);
                String resourceTypeName = ((Resources) obj).getResourceTypeName(resourceId);
                int i3 = 2;
                if (!"string".equals(resourceTypeName)) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Invalid preference key type: %s, at:%d", resourceTypeName, Integer.valueOf(i2)));
                }
                int resourceId2 = obtainTypedArray.getResourceId(i2 + 1, 0);
                if (mhq.o(imw.a, resourceId2)) {
                    imw.c(this, resourceId, resourceId2, obtainTypedArray.getResourceId(i2 + 2, 0), (Resources) obj);
                    i3 = 3;
                } else {
                    imw.c(this, resourceId, imw.a(((Resources) obj).getResourceTypeName(resourceId2)), resourceId2, (Resources) obj);
                }
                i2 += i3;
            }
            obtainTypedArray.recycle();
        } catch (Resources.NotFoundException e) {
            ((luc) ((luc) ((luc) b.d()).i(e)).k("com/google/android/libraries/inputmethod/preferences/DefaultValuesEditor", "applyDefaultValues", 'p', "DefaultValuesEditor.java")).t("applyDefaultValues: resource not found.");
        }
    }

    public final void h(int... iArr) {
        int i;
        int[] iArr2 = imw.a;
        Object obj = this.c.b;
        for (int i2 = 0; i2 <= 0; i2++) {
            try {
                TypedArray obtainTypedArray = ((Resources) obj).obtainTypedArray(iArr[i2]);
                int length = obtainTypedArray.length();
                int i3 = 0;
                while (i3 < length) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    String resourceTypeName = ((Resources) obj).getResourceTypeName(resourceId);
                    if (!"string".equals(resourceTypeName)) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Invalid preference key type: %s, at:%d", resourceTypeName, Integer.valueOf(i3)));
                        break;
                    }
                    int resourceId2 = obtainTypedArray.getResourceId(i3 + 1, 0);
                    int resourceId3 = obtainTypedArray.getResourceId(i3 + 2, 0);
                    if (mhq.o(imw.a, resourceId3)) {
                        imw.b(this, resourceId, resourceId2, resourceId3, obtainTypedArray.getResourceId(i3 + 3, 0), (Resources) obj);
                        i = 4;
                    } else {
                        imw.b(this, resourceId, resourceId2, imw.a(((Resources) obj).getResourceTypeName(resourceId3)), resourceId3, (Resources) obj);
                        i = 3;
                    }
                    i3 += i;
                }
                obtainTypedArray.recycle();
            } catch (Resources.NotFoundException e) {
                ((luc) ((luc) ((luc) b.d()).i(e)).k("com/google/android/libraries/inputmethod/preferences/DefaultValuesEditor", "loadRuntimeDefaultValuesFromSystemProperties", (char) 132, "DefaultValuesEditor.java")).t("loadDefaultValuesFromSystemProperties: resource not found.");
            }
        }
    }

    public final void i(int i, lgb lgbVar) {
        this.a.put(this.c.n(i), lgbVar);
    }
}
