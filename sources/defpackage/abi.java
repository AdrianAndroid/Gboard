package defpackage;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* renamed from: abi  reason: default package */
/* loaded from: classes.dex */
public final class abi {
    public static final abi a = new abi(16, (CharSequence) null);
    public static final abi b = new abi(4096, (CharSequence) null);
    public static final abi c = new abi(8192, (CharSequence) null);
    public static final abi d = new abi(262144, (CharSequence) null);
    public static final abi e = new abi(524288, (CharSequence) null);
    public static final abi f = new abi(1048576, (CharSequence) null);
    public static final abi g = new abi(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
    public static final abi h = new abi(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
    final Object i;
    public final int j;
    public final Class k;
    public final abs l;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
        new abi(1, (CharSequence) null);
        new abi(2, (CharSequence) null);
        new abi(4, (CharSequence) null);
        new abi(8, (CharSequence) null);
        new abi(32, (CharSequence) null);
        new abi(64, (CharSequence) null);
        new abi(128, (CharSequence) null);
        new abi(256, abl.class);
        new abi(512, abl.class);
        new abi(1024, abm.class);
        new abi(2048, abm.class);
        new abi(16384, (CharSequence) null);
        new abi(32768, (CharSequence) null);
        new abi(65536, (CharSequence) null);
        new abi(131072, abq.class);
        new abi(2097152, abr.class);
        new abi(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
        new abi(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, abo.class);
        new abi(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
        new abi(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
        new abi(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
        new abi(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
        new abi(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
        new abi(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
        new abi(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
        new abi(Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, abp.class);
        new abi(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, abn.class);
        new abi(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
        new abi(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, null, null, null);
        new abi(Build.VERSION.SDK_INT >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, null, null, null);
        new abi(Build.VERSION.SDK_INT >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, null, null, null);
        new abi(Build.VERSION.SDK_INT >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, 16908373, null, null, null);
        new abi(Build.VERSION.SDK_INT >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, 16908374, null, null, null);
        if (Build.VERSION.SDK_INT >= 32) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
        }
        new abi(accessibilityAction, 16908375, null, null, null);
    }

    public abi(int i, CharSequence charSequence) {
        this(null, i, charSequence, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.i).getId();
    }

    public final CharSequence b() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.i).getLabel();
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof abi) && this.i.equals(((abi) obj).i);
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    private abi(int i, Class cls) {
        this(null, i, null, null, cls);
    }

    public abi(Object obj, int i, CharSequence charSequence, abs absVar, Class cls) {
        this.j = i;
        this.l = absVar;
        this.i = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i, charSequence) : obj;
        this.k = cls;
    }
}
