package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* renamed from: laq  reason: default package */
/* loaded from: classes.dex */
public class laq {
    private static ThreadPoolExecutor a;

    public static Executor c() {
        if (a == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new kjh(2));
            a = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return a;
    }

    public static int e(AssetManager assetManager, File file) {
        return ((Integer) lby.g(assetManager, "addAssetPath", Integer.class, String.class, file.getPath())).intValue();
    }

    public static RectF f(kyv kyvVar, View view) {
        if (view == null) {
            return new RectF();
        }
        if (kyvVar.s || !(view instanceof kyu)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        kyu kyuVar = (kyu) view;
        View[] viewArr = {kyuVar.a, kyuVar.b, null};
        int i = 0;
        int i2 = 0;
        boolean z = false;
        for (int i3 = 0; i3 < 3; i3++) {
            View view2 = viewArr[i3];
            if (view2 != null && view2.getVisibility() == 0) {
                i2 = z ? Math.min(i2, view2.getLeft()) : view2.getLeft();
                i = z ? Math.max(i, view2.getRight()) : view2.getRight();
                z = true;
            }
        }
        int i4 = i - i2;
        View[] viewArr2 = {kyuVar.a, kyuVar.b, null};
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        for (int i7 = 0; i7 < 3; i7++) {
            View view3 = viewArr2[i7];
            if (view3 != null && view3.getVisibility() == 0) {
                i6 = z2 ? Math.min(i6, view3.getTop()) : view3.getTop();
                i5 = z2 ? Math.max(i5, view3.getBottom()) : view3.getBottom();
                z2 = true;
            }
        }
        int i8 = i5 - i6;
        int a2 = (int) kvj.a(kyuVar.getContext(), 24);
        if (i4 < a2) {
            i4 = a2;
        }
        int left = (kyuVar.getLeft() + kyuVar.getRight()) / 2;
        int top = (kyuVar.getTop() + kyuVar.getBottom()) / 2;
        int i9 = i4 / 2;
        return new RectF(left - i9, top - (i8 / 2), i9 + left, top + (left / 2));
    }

    public static kxc g() {
        return new kxc();
    }

    public static void h(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof kxe) {
            ((kxe) background).k(f);
        }
    }

    public static void i(View view) {
        Drawable background = view.getBackground();
        if (background instanceof kxe) {
            j(view, (kxe) background);
        }
    }

    public static void j(View view, kxe kxeVar) {
        ktw ktwVar = kxeVar.a.b;
        if (ktwVar == null || !ktwVar.a) {
            return;
        }
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += aad.a((View) parent);
        }
        kxd kxdVar = kxeVar.a;
        if (kxdVar.n == f) {
            return;
        }
        kxdVar.n = f;
        kxeVar.q();
    }

    public static kxc k(int i) {
        return i != 0 ? i != 1 ? l() : new kxb() : new kxh();
    }

    public static kxc l() {
        return new kxh();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.Map, java.lang.Object] */
    public static lbi m(XmlPullParser xmlPullParser, jlt jltVar) {
        while (xmlPullParser.next() != 1) {
            try {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("splits")) {
                        while (xmlPullParser.next() != 3) {
                            if (xmlPullParser.getEventType() == 2) {
                                if (xmlPullParser.getName().equals("module")) {
                                    String n = n("name", xmlPullParser);
                                    if (n != null) {
                                        while (xmlPullParser.next() != 3) {
                                            if (xmlPullParser.getEventType() == 2) {
                                                if (xmlPullParser.getName().equals("language")) {
                                                    while (xmlPullParser.next() != 3) {
                                                        if (xmlPullParser.getEventType() == 2) {
                                                            if (xmlPullParser.getName().equals("entry")) {
                                                                String n2 = n("key", xmlPullParser);
                                                                String n3 = n("split", xmlPullParser);
                                                                o(xmlPullParser);
                                                                if (n2 != null && n3 != null) {
                                                                    if (!jltVar.a.containsKey(n2)) {
                                                                        jltVar.a.put(n2, new HashMap());
                                                                    }
                                                                    ((Map) jltVar.a.get(n2)).put(n, n3);
                                                                }
                                                            } else {
                                                                o(xmlPullParser);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    o(xmlPullParser);
                                                }
                                            }
                                        }
                                    } else {
                                        o(xmlPullParser);
                                    }
                                } else {
                                    o(xmlPullParser);
                                }
                            }
                        }
                    } else {
                        o(xmlPullParser);
                    }
                }
            } catch (IOException | IllegalStateException | XmlPullParserException e) {
                Log.e("SplitInstall", "Error while parsing splits.xml", e);
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : jltVar.a.entrySet()) {
            hashMap.put((String) entry.getKey(), Collections.unmodifiableMap(new HashMap((Map) entry.getValue())));
        }
        return new lbi(Collections.unmodifiableMap(hashMap));
    }

    private static String n(String str, XmlPullParser xmlPullParser) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    private static void o(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public void a(kyv kyvVar, View view, View view2, float f, Drawable drawable) {
        RectF f2 = f(kyvVar, view);
        RectF f3 = f(kyvVar, view2);
        drawable.setBounds(krt.c((int) f2.left, (int) f3.left, f), drawable.getBounds().top, krt.c((int) f2.right, (int) f3.right, f), drawable.getBounds().bottom);
    }

    public final synchronized void d(Context context, Set set) {
        AssetManager assets = context.getAssets();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            e(assets, (File) it.next());
        }
    }
}
