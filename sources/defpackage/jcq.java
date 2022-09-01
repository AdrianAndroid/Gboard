package defpackage;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.method.Touch;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;

/* compiled from: PG */
/* renamed from: jcq  reason: default package */
/* loaded from: classes.dex */
public final class jcq extends LinkMovementMethod {
    private final MovementMethod a;

    static {
        new jcq(null);
    }

    private jcq(MovementMethod movementMethod) {
        this.a = movementMethod;
    }

    public static void a(TextView textView) {
        MovementMethod movementMethod = textView.getMovementMethod();
        if (!(movementMethod instanceof jcq)) {
            textView.setMovementMethod(new jcq(movementMethod));
        }
        textView.setFocusable(false);
        textView.setClickable(false);
        textView.setLongClickable(false);
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int totalPaddingLeft = textView.getTotalPaddingLeft();
            int totalPaddingTop = textView.getTotalPaddingTop();
            int scrollX = textView.getScrollX();
            int scrollY = textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((((int) y) - totalPaddingTop) + scrollY), (((int) x) - totalPaddingLeft) + scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                ClickableSpan clickableSpan = clickableSpanArr[0];
                int spanStart = spannable.getSpanStart(clickableSpan);
                int spanEnd = spannable.getSpanEnd(clickableSpan);
                if (spanStart <= offsetForHorizontal && offsetForHorizontal < spanEnd) {
                    if (action == 1) {
                        clickableSpan.onClick(textView);
                    } else {
                        Selection.setSelection(spannable, spanStart, spanEnd);
                    }
                    return true;
                }
            }
            Selection.removeSelection(spannable);
            MovementMethod movementMethod = this.a;
            if (movementMethod != null) {
                return movementMethod.onTouchEvent(textView, spannable, motionEvent);
            }
            Touch.onTouchEvent(textView, spannable, motionEvent);
            return false;
        }
        return Touch.onTouchEvent(textView, spannable, motionEvent);
    }
}
