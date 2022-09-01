package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Looper;
import android.util.Log;
import android.view.inputmethod.CursorAnchorInfo;
import com.google.android.libraries.inputmethod.future.MoreFutures$Callback;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: hjg  reason: default package */
/* loaded from: classes.dex */
public final class hjg {
    public static final hix a(Executor executor, afv afvVar, afp afpVar, boolean z, llk llkVar, llk llkVar2, llk llkVar3) {
        if (afvVar != null) {
            afp afpVar2 = afvVar.I().a;
            if (!afpVar2.a(afpVar)) {
                if (z) {
                    throw new IllegalStateException(String.format(Locale.US, "lifecycle owner is %s, but must at least be %s", afpVar2, afpVar));
                }
                ((ltd) ((ltd) hji.a.c()).k("com/google/android/libraries/inputmethod/future/MoreFutures$FutureCallbackBuilder", "build", 454, "MoreFutures.java")).G("lifecycle owner is %s, but must at least be %s", afpVar2, afpVar);
                return hji.c;
            }
        }
        if (executor == null) {
            throw new IllegalStateException("callback executor was not provided");
        }
        MoreFutures$Callback moreFutures$Callback = new MoreFutures$Callback(executor, afpVar, new hjf(afvVar, llkVar.g(), llkVar2.g(), llkVar3.g()));
        if (afvVar != null) {
            afvVar.I().b(moreFutures$Callback);
        }
        return moreFutures$Callback;
    }

    public static hiz b(hja hjaVar) {
        return (hiz) ((hjaVar == null || !hjaVar.hasNext()) ? hiz.m(new NoSuchElementException("FutureIterator has no more pages")) : hjaVar.next());
    }

    public static hja c(mko mkoVar) {
        return d(lre.N(mkoVar));
    }

    public static hja d(Iterator it) {
        return new hjb(it);
    }

    public static hja e(lgb lgbVar) {
        return d(lre.S(lre.N(lgbVar), hht.e));
    }

    public static hja f(leq leqVar) {
        return new hjc(leqVar);
    }

    public static hja g(hja hjaVar, leq leqVar, Executor executor) {
        return d(lre.S(hjaVar, new fyn(leqVar, executor, 8)));
    }

    public static boolean h(hja hjaVar) {
        return hjaVar != null && hjaVar.hasNext();
    }

    public static void i(Context context) {
        fuj j = j(context);
        j.b = "com.google.android.inputmethod.latin.SLOWNESS_REPORT";
        j.a = "Typing was slower than expected.";
        t(context, j.a());
    }

    public static fuj j(Context context) {
        fuj fujVar = new fuj(context);
        fujVar.c = false;
        fujVar.b(s(false), false);
        return fujVar;
    }

    public static void k(Context context, String str) {
        fuj j = j(context);
        if (str != null) {
            j.b = str;
        }
        t(context, j.a());
    }

    public static Rect m(CursorAnchorInfo cursorAnchorInfo, int i) {
        RectF characterBounds;
        Rect rect = new Rect();
        if (cursorAnchorInfo != null) {
            int i2 = i - 1;
            if (i2 == 0) {
                characterBounds = cursorAnchorInfo.getCharacterBounds(cursorAnchorInfo.getComposingTextStart());
            } else if (i2 != 1) {
                characterBounds = cursorAnchorInfo.getCharacterBounds(cursorAnchorInfo.getSelectionEnd());
            } else {
                characterBounds = cursorAnchorInfo.getCharacterBounds(cursorAnchorInfo.getSelectionStart());
            }
            if (characterBounds == null && !Float.isNaN(cursorAnchorInfo.getInsertionMarkerHorizontal())) {
                characterBounds = new RectF(cursorAnchorInfo.getInsertionMarkerHorizontal(), cursorAnchorInfo.getInsertionMarkerTop(), cursorAnchorInfo.getInsertionMarkerHorizontal(), cursorAnchorInfo.getInsertionMarkerBottom());
            }
            if (characterBounds != null) {
                cursorAnchorInfo.getMatrix().mapRect(characterBounds);
                characterBounds.round(rect);
            }
        }
        return rect;
    }

    public static gyz n(Context context) {
        Object systemService = context.getSystemService("layout_inflater");
        return systemService instanceof gyz ? (gyz) systemService : new gyy(context);
    }

    public static /* synthetic */ void o(Throwable th, Throwable th2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
        } catch (Exception unused) {
        }
    }

    public static void p() {
        if (r()) {
            Log.wtf("ThreadUtil", "Expected not in UI thread, but is.");
        }
    }

    public static void q() {
        if (!r()) {
            Log.wtf("ThreadUtil", "Expected in UI thread, but not.");
        }
    }

    public static boolean r() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static fyb s(boolean z) {
        return new hhh(z);
    }

    private static void t(Context context, ful fulVar) {
        fui.a(context).j(fulVar);
    }
}
