package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import com.google.android.inputmethod.latin.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: mv  reason: default package */
/* loaded from: classes2.dex */
public final class mv {
    private static mv b;
    private WeakHashMap c;
    private qv d;
    private qw e;
    private final WeakHashMap f = new WeakHashMap(0);
    private TypedValue g;
    private boolean h;
    private mu i;
    private static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static final qu j = new qu(6);

    public static synchronized PorterDuffColorFilter b(int i, PorterDuff.Mode mode) {
        synchronized (mv.class) {
            qu quVar = j;
            PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) quVar.b(Integer.valueOf(qu.d(i, mode)));
            if (porterDuffColorFilter == null) {
                PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i, mode);
                PorterDuffColorFilter porterDuffColorFilter3 = (PorterDuffColorFilter) quVar.c(Integer.valueOf(qu.d(i, mode)), porterDuffColorFilter2);
                return porterDuffColorFilter2;
            }
            return porterDuffColorFilter;
        }
    }

    public static synchronized mv e() {
        mv mvVar;
        synchronized (mv.class) {
            if (b == null) {
                mv mvVar2 = new mv();
                b = mvVar2;
                if (Build.VERSION.SDK_INT < 24) {
                    mvVar2.k("vector", new mr(2));
                    mvVar2.k("animated-vector", new mr(0));
                    mvVar2.k("animated-selector", new mr(1));
                    mvVar2.k("drawable", new ms());
                }
            }
            mvVar = b;
        }
        return mvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void h(android.graphics.drawable.Drawable r4, defpackage.nu r5, int[] r6) {
        /*
            int[] r0 = r4.getState()
            android.graphics.Rect r1 = defpackage.ke.a
            android.graphics.drawable.Drawable r1 = r4.mutate()
            if (r1 != r4) goto L52
            boolean r1 = r4 instanceof android.graphics.drawable.LayerDrawable
            r2 = 0
            if (r1 == 0) goto L1f
            boolean r1 = r4.isStateful()
            if (r1 == 0) goto L1f
            int[] r1 = new int[r2]
            r4.setState(r1)
            r4.setState(r0)
        L1f:
            boolean r0 = r5.d
            r1 = 0
            if (r0 != 0) goto L2e
            boolean r0 = r5.c
            if (r0 == 0) goto L2a
            r0 = r1
            goto L30
        L2a:
            r4.clearColorFilter()
            goto L49
        L2e:
            android.content.res.ColorStateList r0 = r5.a
        L30:
            boolean r3 = r5.c
            if (r3 == 0) goto L37
            android.graphics.PorterDuff$Mode r5 = r5.b
            goto L39
        L37:
            android.graphics.PorterDuff$Mode r5 = defpackage.mv.a
        L39:
            if (r0 == 0) goto L46
            if (r5 != 0) goto L3e
            goto L46
        L3e:
            int r6 = r0.getColorForState(r6, r2)
            android.graphics.PorterDuffColorFilter r1 = b(r6, r5)
        L46:
            r4.setColorFilter(r1)
        L49:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 23
            if (r5 > r6) goto L52
            r4.invalidateSelf()
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mv.h(android.graphics.drawable.Drawable, nu, int[]):void");
    }

    private static long i(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private final synchronized Drawable j(Context context, long j2) {
        qs qsVar = (qs) this.f.get(context);
        if (qsVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) qsVar.d(j2);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState == null) {
                int b2 = qx.b(qsVar.b, qsVar.d, j2);
                if (b2 >= 0) {
                    Object[] objArr = qsVar.c;
                    Object obj = objArr[b2];
                    Object obj2 = qt.a;
                    if (obj != obj2) {
                        objArr[b2] = obj2;
                        qsVar.a = true;
                    }
                }
            } else {
                return constantState.newDrawable(context.getResources());
            }
        }
        return null;
    }

    private final void k(String str, mt mtVar) {
        if (this.d == null) {
            this.d = new qv();
        }
        this.d.put(str, mtVar);
    }

    private final synchronized void l(Context context, long j2, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            qs qsVar = (qs) this.f.get(context);
            if (qsVar == null) {
                qsVar = new qs();
                this.f.put(context, qsVar);
            }
            qsVar.j(j2, new WeakReference(constantState));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized ColorStateList a(Context context, int i) {
        int b2;
        qw qwVar;
        WeakHashMap weakHashMap = this.c;
        ColorStateList colorStateList = null;
        ColorStateList colorStateList2 = (weakHashMap == null || (qwVar = (qw) weakHashMap.get(context)) == null) ? null : (ColorStateList) qwVar.d(i);
        if (colorStateList2 == null) {
            mu muVar = this.i;
            if (muVar != null) {
                if (i == R.drawable.f43850_resource_name_obfuscated_res_0x7f080034) {
                    colorStateList = uv.c(context, R.color.f20890_resource_name_obfuscated_res_0x7f06001a);
                } else if (i == R.drawable.f44300_resource_name_obfuscated_res_0x7f080062) {
                    colorStateList = uv.c(context, R.color.f20920_resource_name_obfuscated_res_0x7f06001d);
                } else if (i == R.drawable.f44290_resource_name_obfuscated_res_0x7f080061) {
                    int[][] iArr = new int[3];
                    int[] iArr2 = new int[3];
                    ColorStateList c = nr.c(context, R.attr.f10030_resource_name_obfuscated_res_0x7f040359);
                    if (c == null || !c.isStateful()) {
                        iArr[0] = nr.a;
                        iArr2[0] = nr.a(context, R.attr.f10030_resource_name_obfuscated_res_0x7f040359);
                        iArr[1] = nr.d;
                        iArr2[1] = nr.b(context, R.attr.f9400_resource_name_obfuscated_res_0x7f040317);
                        iArr[2] = nr.e;
                        iArr2[2] = nr.b(context, R.attr.f10030_resource_name_obfuscated_res_0x7f040359);
                    } else {
                        int[] iArr3 = nr.a;
                        iArr[0] = iArr3;
                        iArr2[0] = c.getColorForState(iArr3, 0);
                        iArr[1] = nr.d;
                        iArr2[1] = nr.b(context, R.attr.f9400_resource_name_obfuscated_res_0x7f040317);
                        iArr[2] = nr.e;
                        iArr2[2] = c.getDefaultColor();
                    }
                    colorStateList = new ColorStateList(iArr, iArr2);
                } else {
                    if (i == R.drawable.f43730_resource_name_obfuscated_res_0x7f080028) {
                        b2 = nr.b(context, R.attr.f9380_resource_name_obfuscated_res_0x7f040315);
                    } else if (i == R.drawable.f43670_resource_name_obfuscated_res_0x7f080022) {
                        colorStateList = ie.b(context, 0);
                    } else if (i == R.drawable.f43720_resource_name_obfuscated_res_0x7f080027) {
                        b2 = nr.b(context, R.attr.f9330_resource_name_obfuscated_res_0x7f040310);
                    } else {
                        if (i != R.drawable.f44250_resource_name_obfuscated_res_0x7f08005d && i != R.drawable.f44260_resource_name_obfuscated_res_0x7f08005e) {
                            if (ie.a(((ie) muVar).b, i)) {
                                colorStateList = nr.c(context, R.attr.f9420_resource_name_obfuscated_res_0x7f040319);
                            } else if (ie.a(((ie) muVar).e, i)) {
                                colorStateList = uv.c(context, R.color.f20880_resource_name_obfuscated_res_0x7f060019);
                            } else if (ie.a(((ie) muVar).f, i)) {
                                colorStateList = uv.c(context, R.color.f20870_resource_name_obfuscated_res_0x7f060018);
                            } else if (i == R.drawable.f44220_resource_name_obfuscated_res_0x7f08005a) {
                                colorStateList = uv.c(context, R.color.f20900_resource_name_obfuscated_res_0x7f06001b);
                                i = R.drawable.f44220_resource_name_obfuscated_res_0x7f08005a;
                            }
                        }
                        colorStateList = uv.c(context, R.color.f20910_resource_name_obfuscated_res_0x7f06001c);
                    }
                    colorStateList = ie.b(context, b2);
                }
            }
            if (colorStateList != null) {
                if (this.c == null) {
                    this.c = new WeakHashMap();
                }
                qw qwVar2 = (qw) this.c.get(context);
                if (qwVar2 == null) {
                    qwVar2 = new qw();
                    this.c.put(context, qwVar2);
                }
                qwVar2.f(i, colorStateList);
                return colorStateList;
            }
            colorStateList2 = colorStateList;
        }
        return colorStateList2;
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    public final synchronized void f(Context context) {
        qs qsVar = (qs) this.f.get(context);
        if (qsVar != null) {
            qsVar.h();
        }
    }

    public final synchronized void g(mu muVar) {
        this.i = muVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0181, code lost:
        defpackage.wf.h(r0, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ec A[Catch: all -> 0x027b, TryCatch #1 {, blocks: (B:4:0x0007, B:7:0x002d, B:9:0x0033, B:11:0x0039, B:13:0x003d, B:16:0x004d, B:19:0x005e, B:21:0x0062, B:22:0x0069, B:27:0x00ec, B:29:0x00f0, B:30:0x00f7, B:33:0x010c, B:37:0x0153, B:40:0x0117, B:42:0x0133, B:44:0x013d, B:46:0x0147, B:48:0x015e, B:50:0x0164, B:52:0x016a, B:56:0x0181, B:59:0x026c, B:65:0x017d, B:66:0x0187, B:70:0x019e, B:71:0x01c5, B:75:0x01d0, B:77:0x01fa, B:81:0x024f, B:83:0x0262, B:84:0x020e, B:87:0x021f, B:89:0x022c, B:93:0x0236, B:101:0x007d, B:103:0x0081, B:106:0x008f, B:107:0x0097, B:112:0x00a0, B:113:0x00a7, B:115:0x00a8, B:117:0x00bb, B:119:0x00c5, B:121:0x00cf, B:123:0x00d8, B:124:0x0057, B:126:0x000e, B:128:0x0019, B:130:0x001d, B:132:0x0271, B:133:0x027a), top: B:3:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0153 A[Catch: all -> 0x027b, TryCatch #1 {, blocks: (B:4:0x0007, B:7:0x002d, B:9:0x0033, B:11:0x0039, B:13:0x003d, B:16:0x004d, B:19:0x005e, B:21:0x0062, B:22:0x0069, B:27:0x00ec, B:29:0x00f0, B:30:0x00f7, B:33:0x010c, B:37:0x0153, B:40:0x0117, B:42:0x0133, B:44:0x013d, B:46:0x0147, B:48:0x015e, B:50:0x0164, B:52:0x016a, B:56:0x0181, B:59:0x026c, B:65:0x017d, B:66:0x0187, B:70:0x019e, B:71:0x01c5, B:75:0x01d0, B:77:0x01fa, B:81:0x024f, B:83:0x0262, B:84:0x020e, B:87:0x021f, B:89:0x022c, B:93:0x0236, B:101:0x007d, B:103:0x0081, B:106:0x008f, B:107:0x0097, B:112:0x00a0, B:113:0x00a7, B:115:0x00a8, B:117:0x00bb, B:119:0x00c5, B:121:0x00cf, B:123:0x00d8, B:124:0x0057, B:126:0x000e, B:128:0x0019, B:130:0x001d, B:132:0x0271, B:133:0x027a), top: B:3:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015e A[Catch: all -> 0x027b, TryCatch #1 {, blocks: (B:4:0x0007, B:7:0x002d, B:9:0x0033, B:11:0x0039, B:13:0x003d, B:16:0x004d, B:19:0x005e, B:21:0x0062, B:22:0x0069, B:27:0x00ec, B:29:0x00f0, B:30:0x00f7, B:33:0x010c, B:37:0x0153, B:40:0x0117, B:42:0x0133, B:44:0x013d, B:46:0x0147, B:48:0x015e, B:50:0x0164, B:52:0x016a, B:56:0x0181, B:59:0x026c, B:65:0x017d, B:66:0x0187, B:70:0x019e, B:71:0x01c5, B:75:0x01d0, B:77:0x01fa, B:81:0x024f, B:83:0x0262, B:84:0x020e, B:87:0x021f, B:89:0x022c, B:93:0x0236, B:101:0x007d, B:103:0x0081, B:106:0x008f, B:107:0x0097, B:112:0x00a0, B:113:0x00a7, B:115:0x00a8, B:117:0x00bb, B:119:0x00c5, B:121:0x00cf, B:123:0x00d8, B:124:0x0057, B:126:0x000e, B:128:0x0019, B:130:0x001d, B:132:0x0271, B:133:0x027a), top: B:3:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0164 A[Catch: all -> 0x027b, TryCatch #1 {, blocks: (B:4:0x0007, B:7:0x002d, B:9:0x0033, B:11:0x0039, B:13:0x003d, B:16:0x004d, B:19:0x005e, B:21:0x0062, B:22:0x0069, B:27:0x00ec, B:29:0x00f0, B:30:0x00f7, B:33:0x010c, B:37:0x0153, B:40:0x0117, B:42:0x0133, B:44:0x013d, B:46:0x0147, B:48:0x015e, B:50:0x0164, B:52:0x016a, B:56:0x0181, B:59:0x026c, B:65:0x017d, B:66:0x0187, B:70:0x019e, B:71:0x01c5, B:75:0x01d0, B:77:0x01fa, B:81:0x024f, B:83:0x0262, B:84:0x020e, B:87:0x021f, B:89:0x022c, B:93:0x0236, B:101:0x007d, B:103:0x0081, B:106:0x008f, B:107:0x0097, B:112:0x00a0, B:113:0x00a7, B:115:0x00a8, B:117:0x00bb, B:119:0x00c5, B:121:0x00cf, B:123:0x00d8, B:124:0x0057, B:126:0x000e, B:128:0x0019, B:130:0x001d, B:132:0x0271, B:133:0x027a), top: B:3:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x026c A[Catch: all -> 0x027b, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0007, B:7:0x002d, B:9:0x0033, B:11:0x0039, B:13:0x003d, B:16:0x004d, B:19:0x005e, B:21:0x0062, B:22:0x0069, B:27:0x00ec, B:29:0x00f0, B:30:0x00f7, B:33:0x010c, B:37:0x0153, B:40:0x0117, B:42:0x0133, B:44:0x013d, B:46:0x0147, B:48:0x015e, B:50:0x0164, B:52:0x016a, B:56:0x0181, B:59:0x026c, B:65:0x017d, B:66:0x0187, B:70:0x019e, B:71:0x01c5, B:75:0x01d0, B:77:0x01fa, B:81:0x024f, B:83:0x0262, B:84:0x020e, B:87:0x021f, B:89:0x022c, B:93:0x0236, B:101:0x007d, B:103:0x0081, B:106:0x008f, B:107:0x0097, B:112:0x00a0, B:113:0x00a7, B:115:0x00a8, B:117:0x00bb, B:119:0x00c5, B:121:0x00cf, B:123:0x00d8, B:124:0x0057, B:126:0x000e, B:128:0x0019, B:130:0x001d, B:132:0x0271, B:133:0x027a), top: B:3:0x0007, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.graphics.drawable.Drawable d(android.content.Context r17, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mv.d(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }
}
