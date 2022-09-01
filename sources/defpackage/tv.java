package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* compiled from: PG */
/* renamed from: tv  reason: default package */
/* loaded from: classes2.dex */
public final class tv {
    public static void a(Activity activity) {
        activity.finishAffinity();
    }

    public static void b(Activity activity, Intent intent, int i, Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }

    public static void c(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public static void d(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof yv) {
            ((yv) viewParent).d(view, i, i2, iArr, i3);
        } else if (i3 != 0) {
        } else {
            try {
                aaj.a(viewParent, view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
            }
        }
    }

    public static void e(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof yw) {
            ((yw) viewParent).f(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof yv) {
            ((yv) viewParent).e(view, i, i2, i3, i4, i5);
        } else if (i5 != 0) {
        } else {
            try {
                aaj.b(viewParent, view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e);
            }
        }
    }

    public static void f(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof yv) {
            ((yv) viewParent).g(view, view2, i, i2);
        } else if (i2 != 0) {
        } else {
            try {
                aaj.c(viewParent, view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
            }
        }
    }

    public static void g(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof yv) {
            ((yv) viewParent).h(view, i);
        } else if (i != 0) {
        } else {
            try {
                aaj.d(viewParent, view);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
            }
        }
    }

    public static boolean h(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return aaj.e(viewParent, view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    public static boolean i(ViewParent viewParent, View view, float f, float f2) {
        try {
            return aaj.f(viewParent, view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    public static boolean j(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof yv) {
            return ((yv) viewParent).t(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        try {
            return aaj.g(viewParent, view, view2, i);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
            return false;
        }
    }
}
