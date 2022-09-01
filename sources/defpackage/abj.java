package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: abj  reason: default package */
/* loaded from: classes.dex */
public final class abj {
    public static int a;
    public final AccessibilityNodeInfo b;

    private abj(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.b = accessibilityNodeInfo;
    }

    public static abj b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new abj(accessibilityNodeInfo);
    }

    public static ClickableSpan[] m(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public static final SparseArray n(View view) {
        return (SparseArray) view.getTag(R.id.f129330_resource_name_obfuscated_res_0x7f0b2154);
    }

    public final Bundle a() {
        return this.b.getExtras();
    }

    public final List c(String str) {
        ArrayList<Integer> integerArrayList = this.b.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.b.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    public final void d(int i) {
        this.b.addAction(i);
    }

    public final void e(abi abiVar) {
        this.b.addAction((AccessibilityNodeInfo.AccessibilityAction) abiVar.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof abj)) {
            return false;
        }
        AccessibilityNodeInfo accessibilityNodeInfo = this.b;
        AccessibilityNodeInfo accessibilityNodeInfo2 = ((abj) obj).b;
        if (accessibilityNodeInfo == null) {
            if (accessibilityNodeInfo2 != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(accessibilityNodeInfo2)) {
            return false;
        }
        return true;
    }

    public final void f(int i, boolean z) {
        Bundle a2 = a();
        if (a2 != null) {
            int i2 = a2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i ^ (-1));
            if (true != z) {
                i = 0;
            }
            a2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public final void g(boolean z) {
        this.b.setCheckable(z);
    }

    public final void h(CharSequence charSequence) {
        this.b.setClassName(charSequence);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.b;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void i(Object obj) {
        this.b.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) ((aqq) obj).a);
    }

    public final void j(Object obj) {
        this.b.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((aqq) obj).a);
    }

    public final void k(boolean z) {
        this.b.setDismissable(z);
    }

    public final void l(boolean z) {
        this.b.setScrollable(z);
    }

    public final void o(abi abiVar) {
        this.b.removeAction((AccessibilityNodeInfo.AccessibilityAction) abiVar.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v5, types: [android.text.SpannableString, android.text.Spannable] */
    public final String toString() {
        ?? text;
        String string;
        List emptyList;
        String str;
        ?? sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        this.b.getBoundsInParent(rect);
        new StringBuilder("; boundsInParent: ").append(rect);
        sb.append("; boundsInParent: ".concat(rect.toString()));
        this.b.getBoundsInScreen(rect);
        new StringBuilder("; boundsInScreen: ").append(rect);
        sb.append("; boundsInScreen: ".concat(rect.toString()));
        sb.append("; packageName: ");
        sb.append(this.b.getPackageName());
        sb.append("; className: ");
        sb.append(this.b.getClassName());
        sb.append("; text: ");
        if (c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            text = this.b.getText();
        } else {
            List c = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List c2 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List c3 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List c4 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            text = new SpannableString(TextUtils.substring(this.b.getText(), 0, this.b.getText().length()));
            for (int i = 0; i < c.size(); i++) {
                text.setSpan(new abg(((Integer) c4.get(i)).intValue(), this, a().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) c.get(i)).intValue(), ((Integer) c2.get(i)).intValue(), ((Integer) c3.get(i)).intValue());
            }
        }
        sb.append(text);
        sb.append("; contentDescription: ");
        sb.append(this.b.getContentDescription());
        sb.append("; viewId: ");
        sb.append(this.b.getViewIdResourceName());
        sb.append("; uniqueId: ");
        if (li.f()) {
            string = this.b.getUniqueId();
        } else {
            string = this.b.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        sb.append(string);
        sb.append("; checkable: ");
        sb.append(this.b.isCheckable());
        sb.append("; checked: ");
        sb.append(this.b.isChecked());
        sb.append("; focusable: ");
        sb.append(this.b.isFocusable());
        sb.append("; focused: ");
        sb.append(this.b.isFocused());
        sb.append("; selected: ");
        sb.append(this.b.isSelected());
        sb.append("; clickable: ");
        sb.append(this.b.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.b.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.b.isEnabled());
        sb.append("; password: ");
        sb.append(this.b.isPassword());
        sb.append("; scrollable: " + this.b.isScrollable());
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.b.getActionList();
        if (actionList != null) {
            emptyList = new ArrayList();
            int size = actionList.size();
            for (int i2 = 0; i2 < size; i2++) {
                emptyList.add(new abi(actionList.get(i2), 0, null, null, null));
            }
        } else {
            emptyList = Collections.emptyList();
        }
        for (int i3 = 0; i3 < emptyList.size(); i3++) {
            abi abiVar = (abi) emptyList.get(i3);
            int a2 = abiVar.a();
            if (a2 == 1) {
                str = "ACTION_FOCUS";
            } else if (a2 != 2) {
                switch (a2) {
                    case 4:
                        str = "ACTION_SELECT";
                        break;
                    case 8:
                        str = "ACTION_CLEAR_SELECTION";
                        break;
                    case 16:
                        str = "ACTION_CLICK";
                        break;
                    case 32:
                        str = "ACTION_LONG_CLICK";
                        break;
                    case 64:
                        str = "ACTION_ACCESSIBILITY_FOCUS";
                        break;
                    case 128:
                        str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                        break;
                    case 256:
                        str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 512:
                        str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 1024:
                        str = "ACTION_NEXT_HTML_ELEMENT";
                        break;
                    case 2048:
                        str = "ACTION_PREVIOUS_HTML_ELEMENT";
                        break;
                    case 4096:
                        str = "ACTION_SCROLL_FORWARD";
                        break;
                    case 8192:
                        str = "ACTION_SCROLL_BACKWARD";
                        break;
                    case 16384:
                        str = "ACTION_COPY";
                        break;
                    case 32768:
                        str = "ACTION_PASTE";
                        break;
                    case 65536:
                        str = "ACTION_CUT";
                        break;
                    case 131072:
                        str = "ACTION_SET_SELECTION";
                        break;
                    case 262144:
                        str = "ACTION_EXPAND";
                        break;
                    case 524288:
                        str = "ACTION_COLLAPSE";
                        break;
                    case 2097152:
                        str = "ACTION_SET_TEXT";
                        break;
                    case 16908354:
                        str = "ACTION_MOVE_WINDOW";
                        break;
                    default:
                        switch (a2) {
                            case 16908342:
                                str = "ACTION_SHOW_ON_SCREEN";
                                break;
                            case 16908343:
                                str = "ACTION_SCROLL_TO_POSITION";
                                break;
                            case 16908344:
                                str = "ACTION_SCROLL_UP";
                                break;
                            case 16908345:
                                str = "ACTION_SCROLL_LEFT";
                                break;
                            case 16908346:
                                str = "ACTION_SCROLL_DOWN";
                                break;
                            case 16908347:
                                str = "ACTION_SCROLL_RIGHT";
                                break;
                            case 16908348:
                                str = "ACTION_CONTEXT_CLICK";
                                break;
                            case 16908349:
                                str = "ACTION_SET_PROGRESS";
                                break;
                            default:
                                switch (a2) {
                                    case 16908356:
                                        str = "ACTION_SHOW_TOOLTIP";
                                        break;
                                    case 16908357:
                                        str = "ACTION_HIDE_TOOLTIP";
                                        break;
                                    case 16908358:
                                        str = "ACTION_PAGE_UP";
                                        break;
                                    case 16908359:
                                        str = "ACTION_PAGE_DOWN";
                                        break;
                                    case 16908360:
                                        str = "ACTION_PAGE_LEFT";
                                        break;
                                    case 16908361:
                                        str = "ACTION_PAGE_RIGHT";
                                        break;
                                    case 16908362:
                                        str = "ACTION_PRESS_AND_HOLD";
                                        break;
                                    default:
                                        switch (a2) {
                                            case 16908372:
                                                str = "ACTION_IME_ENTER";
                                                break;
                                            case 16908373:
                                                str = "ACTION_DRAG_START";
                                                break;
                                            case 16908374:
                                                str = "ACTION_DRAG_DROP";
                                                break;
                                            case 16908375:
                                                str = "ACTION_DRAG_CANCEL";
                                                break;
                                            default:
                                                str = "ACTION_UNKNOWN";
                                                break;
                                        }
                                }
                        }
                }
            } else {
                str = "ACTION_CLEAR_FOCUS";
            }
            if (str.equals("ACTION_UNKNOWN") && abiVar.b() != null) {
                str = abiVar.b().toString();
            }
            sb.append(str);
            if (i3 != emptyList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
