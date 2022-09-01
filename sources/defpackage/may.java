package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: may  reason: default package */
/* loaded from: classes.dex */
public enum may implements nfp {
    UNKNOWN_TRIGGERED_TYPE(0),
    EMOJI_CANDIDATE_AVAILABLE(1),
    EMOJI_AT_END_OF_INPUT_TEXT(2),
    EXPRESSION_MOMENT_CLOSED(3),
    PUNCTUATION_INPUT(4),
    EXPRESSION_MOMENT_OPENED(5),
    INPUT_TEXT_EMPTY(6),
    EXTENSION_DEACTIVATED(7),
    VOICE_INPUT_STARTED(8),
    INPUT_TEXT_EMPTY_AFTER_EMOJIFIED(9),
    INPUT_FIELD_CLICKED_AFTER_EMOJIFIED(10),
    TYPING_STARTED_AFTER_EMOJIFIED(11),
    ACCESS_POINTS_BAR_SHOWN_AFTER_EMOJIFIED(12),
    ACCESS_POINTS_BAR_CLOSED_AFTER_EMOJIFIED(13),
    ACCESS_POINTS_PANEL_SHOWN_AFTER_EMOJIFIED(14),
    ACCESS_POINTS_PANEL_CLOSED_AFTER_EMOJIFIED(16),
    KEYBOARD_SWITCHED_AFTER_EMOJIFIED(17),
    EXTENSION_DEACTIVATED_AFTER_EMOJIFIED(18),
    VOICE_INPUT_STARTED_AFTER_EMOJIFIED(19),
    INPUT_TEXT_SELECTED_AFTER_EMOJIFIED(20),
    CURSOR_MOVED_AFTER_EMOJIFIED(21),
    INPUT_TEXT_NOT_END_WITH_EMOJI(22),
    ACCEPTS_UNDO(23),
    ACCEPTS_UNDO_AFTER_EMOJIFIED(24),
    EXPRESSION_MOMENT_CANDIDATE_AVAILABLE(25),
    EXPRESSION_MOMENT_CANDIDATE_UNAVAILABLE(26);
    
    public final int A;

    may(int i) {
        this.A = i;
    }

    public static may b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_TRIGGERED_TYPE;
            case 1:
                return EMOJI_CANDIDATE_AVAILABLE;
            case 2:
                return EMOJI_AT_END_OF_INPUT_TEXT;
            case 3:
                return EXPRESSION_MOMENT_CLOSED;
            case 4:
                return PUNCTUATION_INPUT;
            case 5:
                return EXPRESSION_MOMENT_OPENED;
            case 6:
                return INPUT_TEXT_EMPTY;
            case 7:
                return EXTENSION_DEACTIVATED;
            case 8:
                return VOICE_INPUT_STARTED;
            case 9:
                return INPUT_TEXT_EMPTY_AFTER_EMOJIFIED;
            case 10:
                return INPUT_FIELD_CLICKED_AFTER_EMOJIFIED;
            case 11:
                return TYPING_STARTED_AFTER_EMOJIFIED;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return ACCESS_POINTS_BAR_SHOWN_AFTER_EMOJIFIED;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return ACCESS_POINTS_BAR_CLOSED_AFTER_EMOJIFIED;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ACCESS_POINTS_PANEL_SHOWN_AFTER_EMOJIFIED;
            case 15:
            default:
                return null;
            case 16:
                return ACCESS_POINTS_PANEL_CLOSED_AFTER_EMOJIFIED;
            case 17:
                return KEYBOARD_SWITCHED_AFTER_EMOJIFIED;
            case 18:
                return EXTENSION_DEACTIVATED_AFTER_EMOJIFIED;
            case 19:
                return VOICE_INPUT_STARTED_AFTER_EMOJIFIED;
            case 20:
                return INPUT_TEXT_SELECTED_AFTER_EMOJIFIED;
            case 21:
                return CURSOR_MOVED_AFTER_EMOJIFIED;
            case 22:
                return INPUT_TEXT_NOT_END_WITH_EMOJI;
            case 23:
                return ACCEPTS_UNDO;
            case 24:
                return ACCEPTS_UNDO_AFTER_EMOJIFIED;
            case 25:
                return EXPRESSION_MOMENT_CANDIDATE_AVAILABLE;
            case 26:
                return EXPRESSION_MOMENT_CANDIDATE_UNAVAILABLE;
        }
    }

    public static nfq c() {
        return maw.f;
    }

    @Override // defpackage.nfp
    public final int a() {
        return this.A;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.A);
    }
}
