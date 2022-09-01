package com.google.android.apps.inputmethod.libs.framework.core;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FloatingCandidatesWindow {
    private final View anchorView;
    private final View contentView;
    private final int[] defaultWindowLocation;
    private final PopupWindow popupWindow;
    private final int[] windowLocation = new int[2];
    private final int[] anchorWindowLocation = new int[2];
    private final int[] previousWindowLocation = new int[2];
    private final int[] tempWindowLocation = new int[2];

    public FloatingCandidatesWindow(View view, View view2, boolean z) {
        this.defaultWindowLocation = r1;
        PopupWindow popupWindow = new PopupWindow(view, -2, -2);
        this.popupWindow = popupWindow;
        popupWindow.setTouchable(z);
        this.contentView = view;
        view.setLayoutDirection(0);
        this.anchorView = view2;
        int[] iArr = {0, gvv.d(view.getContext())};
    }

    public void dismiss() {
        this.popupWindow.dismiss();
    }

    public int[] getTempWindowLocation() {
        return this.tempWindowLocation;
    }

    public int[] getWindowLocation() {
        return this.windowLocation;
    }

    public boolean isTouchable() {
        return this.popupWindow.isTouchable();
    }

    public void resetWindowLocation() {
        updateWindowLocationAndMaybeMove(this.defaultWindowLocation, false);
    }

    public void setTouchable(boolean z) {
        this.popupWindow.setTouchable(z);
    }

    public void show() {
        if (this.popupWindow.isShowing()) {
            PopupWindow popupWindow = this.popupWindow;
            int[] iArr = this.windowLocation;
            popupWindow.update(iArr[0], iArr[1], -1, -1);
        } else if (this.anchorView.getWindowToken() == null) {
        } else {
            PopupWindow popupWindow2 = this.popupWindow;
            View view = this.anchorView;
            int[] iArr2 = this.windowLocation;
            popupWindow2.showAtLocation(view, 0, iArr2[0], iArr2[1]);
        }
    }

    public void updateWindowLocationAndMaybeMove(int[] iArr, boolean z) {
        if (iArr.length != 2) {
            return;
        }
        int[] iArr2 = this.previousWindowLocation;
        int[] iArr3 = this.windowLocation;
        iArr2[0] = iArr3[0];
        iArr2[1] = iArr3[1];
        this.contentView.measure(0, 0);
        int measuredHeight = this.contentView.getMeasuredHeight();
        jdy.g(this.anchorView, this.anchorWindowLocation);
        int d = gvv.d(this.contentView.getContext());
        int i = iArr[1];
        if (i + measuredHeight < d) {
            int[] iArr4 = this.windowLocation;
            int i2 = iArr[0];
            int[] iArr5 = this.anchorWindowLocation;
            iArr4[0] = i2 - iArr5[0];
            iArr4[1] = i - iArr5[1];
        } else {
            int[] iArr6 = this.windowLocation;
            int i3 = iArr[0];
            int[] iArr7 = this.anchorWindowLocation;
            iArr6[0] = i3 - iArr7[0];
            iArr6[1] = (i - measuredHeight) - iArr7[1];
        }
        int[] iArr8 = this.windowLocation;
        int i4 = iArr8[0];
        int[] iArr9 = this.previousWindowLocation;
        if ((i4 == iArr9[0] && iArr8[1] == iArr9[1]) || !this.popupWindow.isShowing() || !z) {
            return;
        }
        PopupWindow popupWindow = this.popupWindow;
        int[] iArr10 = this.windowLocation;
        popupWindow.update(iArr10[0], iArr10[1], -1, -1);
    }
}
