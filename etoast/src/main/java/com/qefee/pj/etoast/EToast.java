package com.qefee.pj.etoast;

import android.content.Context;
import android.support.annotation.StringRes;
import android.widget.Toast;

/**
 * EToast.
 * <ul>
 * <li>date: 16/8/26</li>
 * </ul>
 *
 * @author tongjin
 */
public class EToast {
    /**
     * show toast.
     *
     * @param context context
     * @param text    text
     * @param isLong  isLong
     */
    public static void show(Context context, CharSequence text, boolean isLong) {
        if (isLong) {
            Toast.makeText(context, text, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * show toast.
     *
     * @param context context
     * @param resId   resId
     * @param isLong  isLong
     */
    public static void show(Context context, @StringRes int resId, boolean isLong) {
        if (isLong) {
            Toast.makeText(context, resId, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(context, resId, Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * show toast.
     *
     * @param context context
     * @param text    text
     */
    public static void show(Context context, CharSequence text) {
        show(context, text, false);
    }

    /**
     * show toast.
     *
     * @param context context
     * @param resId   resId
     */
    public static void show(Context context, @StringRes int resId) {
        show(context, resId, false);
    }

    /**
     * show toast.
     *
     * @param context context
     * @param text    text
     * @param isLong  isLong
     */
    public static void s(Context context, CharSequence text, boolean isLong) {
        show(context, text, isLong);
    }

    /**
     * show toast.
     *
     * @param context context
     * @param resId   resId
     * @param isLong  isLong
     */
    public static void s(Context context, @StringRes int resId, boolean isLong) {
        show(context, resId, isLong);
    }

    /**
     * show toast.
     *
     * @param context context
     * @param text    text
     */
    public static void s(Context context, CharSequence text) {
        show(context, text);
    }

    /**
     * show toast.
     *
     * @param context context
     * @param resId   resId
     */
    public static void s(Context context, @StringRes int resId) {
        show(context, resId);
    }
}
