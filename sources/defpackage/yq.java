package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: yq  reason: default package */
/* loaded from: classes2.dex */
public final class yq {
    private static boolean a = false;
    private static Method b = null;
    private static boolean c = false;
    private static Field d;

    public static boolean a(yp ypVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (ypVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return ypVar.hE(keyEvent);
        }
        KeyEvent.DispatcherState dispatcherState = null;
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window = activity.getWindow();
            if (window.hasFeature(8)) {
                ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                    if (!a) {
                        try {
                            b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                        } catch (NoSuchMethodException unused) {
                        }
                        a = true;
                    }
                    Method method = b;
                    if (method != null) {
                        try {
                            Object invoke = method.invoke(actionBar, keyEvent);
                            if (invoke != null) {
                                if (((Boolean) invoke).booleanValue()) {
                                    return true;
                                }
                            }
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                }
            }
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (aad.ab(decorView, keyEvent)) {
                return true;
            }
            if (decorView != null) {
                dispatcherState = decorView.getKeyDispatcherState();
            }
            return keyEvent.dispatch(activity, dispatcherState, activity);
        } else if (!(callback instanceof Dialog)) {
            return (view != null && aad.ab(view, keyEvent)) || ypVar.hE(keyEvent);
        } else {
            Dialog dialog = (Dialog) callback;
            DialogInterface.OnKeyListener b2 = b(dialog);
            if (b2 != null && b2.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            Window window2 = dialog.getWindow();
            if (window2.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView2 = window2.getDecorView();
            if (aad.ab(decorView2, keyEvent)) {
                return true;
            }
            if (decorView2 != null) {
                dispatcherState = decorView2.getKeyDispatcherState();
            }
            return keyEvent.dispatch(dialog, dispatcherState, dialog);
        }
    }

    private static DialogInterface.OnKeyListener b(Dialog dialog) {
        if (!c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            c = true;
        }
        Field field = d;
        if (field != null) {
            try {
                return (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused2) {
                return null;
            }
        }
        return null;
    }
}
